let dao = {
	rtdb: firebase.database(),
	fsdb: firebase.firestore(),
	state: {
		page: 0,
		day: 0,
	},
	get: name => {
		return JSON.parse(localStorage.getItem(name));
	},
	ifNotExistDoThis: (item, callback, arg) => {
		if (localStorage.getItem(item) == null) {
			callback(arg).then(result => {
				localStorage.setItem(item, result);
			});
		}
	},
	selectAll: c => {
		return new Promise(resolve => {
			dao.fsdb
				.collection(c)
				.get()
				.then(querySnapshot => {
					console.log(querySnapshot);
					resolve(JSON.stringify(querySnapshot.docs.map(ele => ele.data())));
				});
		});
	},
	printScreen : (arr) => {
		for (let i = 0; i < arr.length; i++) document.getElementsByClassName('list-group-item')[i].innerHTML = arr[i];
	},
	getCurrentWord: ()=>{
		var arr = dao.get('word').filter(ele => ele.day.slice(0, ele.day.length - 1) === dao.state.day + '');
		var res = [];
		for (let i = dao.state.page * 10, j = 0; i < 10 + dao.state.page * 10 && i < arr.length; i++, j++) {
			res[j] = arr[i].name;
		}
		return res;
	},
	getCurrentValue: ()=>{
		var arr = dao.get('word').filter(ele => ele.day.slice(0, ele.day.length - 1) === dao.state.day + '');
		var res = [];
		for (let i = dao.state.page * 10, j = 0; i < 10 + dao.state.page * 10 && i < arr.length; i++, j++) {
			res[j] = arr[i].value;
		}
		return res;
	},
	initState: () => {
		dao.rtdb.ref('state').on('value', snapshot => {
			let page = snapshot.val().page;
			let day = snapshot.val().day;
			dao.state.page = page;
			dao.state.day = day;
			document.getElementsByClassName('navbar')[0].childNodes[3].innerHTML = day + '일';
			var printValue = ['-','-','-','-','-','-','-','-','-','-'];
			dao.printScreen(printValue);
			dao.printScreen(dao.getCurrentWord());
		});
	},
	move: (day, page) => {
		dao.rtdb.ref().update({
			'/state': {
				day: day,
				page: page,
			},
		});
	},
	downDay: () => {
		if (dao.state.day > 1) dao.move(dao.state.day - 1, 0);
	},
	upDay: () => {
		if (dao.state.day < 30) dao.move(dao.state.day + 1, 0);
	},
	downPage: () => {
		if (dao.state.page > 0) dao.move(dao.state.day, dao.state.page - 1);
	},
	upPage: () => {
		if (
			dao.state.page <
			dao.get('word').filter(ele => ele.day.slice(0, ele.day.length - 1) === dao.state.day + '').length / 10 - 1
		)
			dao.move(dao.state.day, dao.state.page + 1);
	},
	mouseUp: () => {
		var printValue = ['-','-','-','-','-','-','-','-','-','-'];
		dao.printScreen(printValue);
		dao.printScreen(dao.getCurrentWord());
	},
	mouseDown: () => {
		var printValue = ['-','-','-','-','-','-','-','-','-','-'];
		dao.printScreen(printValue);
		dao.printScreen(dao.getCurrentValue());
	},
};
