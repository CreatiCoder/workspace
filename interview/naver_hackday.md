4. 밴드 OpenAPI를 이용한 신규 그룹 커뮤니케이션 서비스 개발

- OAuth 이해, 로그인 구현
2017년 모바일 프로그래밍 프로젝트를 통해 안드로이드에서 로그인 기능을 구현했습니다. OAuth 2.0 기반의 "네이버 아이디로 로그인하기"라는 API를 사용해서 구현했는데 이때, OAuth 1.0와 OAuth 2.0의 차이에 대해서도 배우게 되어 이번 프로젝트에 도움이 될 것입니다.
앱 시현 영상 https://www.youtube.com/watch?v=734RX8H8-gA
앱 발표 피피티 https://drive.google.com/file/d/1i3K5PXAIFR7Lv6LpU5DVJ96eG-t_kn3t/view?usp=sharing

- spring boot, firebase
2015년, 국방통합데이터센터에서 spring framework를 통해 ’성과관리체계’라는 인트라넷 웹서비스를 개발했습니다. boot를알게 된 이후로 얼마나 편리해졌는지 몸소 느낄 수 있었습니다. 2018년, 산학연계 작품을 통해 firebase를 사용하여 pwa 웹앱을 완성하였습니다. 정적 호스팅을 위한 Firebase Hosting, 데이터 저장을 위한 Firestore, 실시간 데이터 변화를 위한 Realtime Database, 푸시 알림을 위한 Firebase Cloud Messaging 을실습하였습니다. 이를 통해 기본적인 Firebase 사용을 해본 경험이 있습니다.
github 주소: https://github.com/creaticoding/CoUpwa

- angular 6, react, vue.js 등 FE 프레임워크 사용
2015년, ‘성과관리체계’에서는 Angularjs 1.0을 사용하였습니다. 비록 최신의 Angular와는 다른 패러다임이지만 FE의 첫 걸음마를 뗀 계기가 되었습니다. 이후 소프트웨어공학과목의 웹 프로젝트를 vue.js를 통해 화면개발을 하였습니다. 마지막으로 2018년 산학연계 작품에서는 React를 사용하여 화면개발 했으며 이때는 상태 및 요청관리를 위해 Redux 및 Router를 사용했습니다. 주요 FE 프레임워크를 사용해본 경험을 통해 각각의 프레임워크가 어떤 관점에서 시작되었으며 서로 무엇이 다른지 잘 파악하고 있습니다.
vue.js 쇼핑몰 시현 영상: https://www.youtube.com/watch?v=xoRRINvt80Q
github 주소: https://github.com/creaticoding/CoUpwa

- 웹 푸시
Firebase를 사용해봤을 당시 웹앱의 푸시 알림을 위해 FCM에 대한 실습을 진행해본 적이 있습니다. 기본적으로 웹 푸시가 어떤 메커니즘을 통해 동작하는지 알고 있습니다.
github 주소: https://github.com/creaticoding/CoUpwa



17. 쇼핑 회원 대상 공지 기능 개발

- push처럼 새 공지가 로그인 중에 있을 때 자동으로 알림
FCM을 사용해 본 경험으로 결국 클라이언트에서 통신을 수신해야 하므로 FCM 구현체 내부에서는 포트를 열어 수신하는 것으로 생각됩니다. 이 아이디어에 착안하여 socket.io 나 websocket 을 활용하여 공지 알림을 구현할 수 있다고 확신합니다.
github 주소: https://github.com/creaticoding/CoUpwa

- React + NodeJS
현재 개인 포트폴리오 사이트 기술 블로그를 제작 중에 있습니다. 사용되는 기술 스펙이 NodeJS, React, Material UI, Scss 입니다. Create-react-app과 express-generator를 동시에 활용하여 사용하였으며 개발 중에는 proxy 옵션을 사용하여 서버와 클라이언트의 api 호출이 가능합니다. 동시에 개발하기 위해 여러 고민을 많이 해보았으며 현재는 개발 가능한 환경을 구축한 상태이며 Material UI를 천천히 공부 중입니다. React와 NodeJS를 함께 사용해본 경험을 토대로 빠른 시간안에 비즈니스 로직을 개발할 환경을 만들 수 있습니다.
github 주소: https://github.com/CreatiCoding/creco

- MongoDB
MEAN 스택을 통하여 함께 토이프로젝트를 시도했던 적이 있습니다. 그때 mongoose를 통해 MongoDB로 접근하여 데이터를 읽고 썼습니다. 또한, Firebase Firestore를 사용해본 경험을 토대로 NoSQL의 모델링은 정규화를 오히려 파괴해야 효율적이란 것을 알고 있습니다.



19. 자동완성 시스템 개발

- NodeJS(Server side)/React(Client side)모두 구현 필요
[2지망과 같습니다.]
현재 개인 포트폴리오 사이트 기술 블로그를 제작중에 있습니다. 사용되는 기술 스펙이 NodeJS, React, Material UI, Scss 입니다. Create-react-app과 express-generator를 동시에 활용하여 사용하였으며 개발중에는 proxy 옵션을 사용하여 서버와 클라이언트의 api 호출이 가능합니다. 동시에 개발하기 위해 여러 고민을 많이 해보았으며 현재는 개발가능한 환경을 구축한 상태이며 Material UI를 천천히 공부중입니다. React와 NodeJS를 함께 사용해본 경험을 토대로 빠른 시간안에 비지니스 로직을 개발할 환경을 만들 수 있습니다.
github 주소: https://github.com/CreatiCoding/creco

- Elastic Stack
웍스모바일 인턴 과제 수행 중 과제 주제가 Elasticsearch의 도입을 통한 검색 엔진 속도 향상이었습니다. 이 과정에서 ELK 스택은 주제와 무관했기에 사용할 기회가 없었으나 제 웹 개발 경험과 Elasticsearch 사용(형태소분석 커스터마이징) 경험을 바탕으로 프로젝트 수행에 문제가 없습니다. 또한, Elasticsearch 의 동작 원리에 관해 공부하여 어떤 식으로 노드를 배치하고 이를 재구성할 수 있습니다.
[private] https://github.com/works-mobile/improve-search
기본적인 설계도
https://user-images.githubusercontent.com/33514304/44511955-08858800-a6f4-11e8-8c22-14955a3bce40.png
https://user-images.githubusercontent.com/33514304/44511661-37e7c500-a6f3-11e8-8dbe-490b72dc9f9f.png

- 자동완성
소프트웨어공학과목의 웹 프로젝트를 vue.js를 통해 진행하던 중 입력한 문자열에 따라 자동으로 검색하고 화면에 동적으로 표현해주는 부분이 있었습니다. 또한, 한글검색을 위해 자음 모음을 분리하여 검색할 수 있는 오픈 소스를 사용했습니다. 이를 통해 기본적으로 자동완성이 서버와의 통신을 이용하여 자동완성될 후보 문자열을 받아와야 한다는 것을 이해하고 있습니다. Elastic search와 함께 사용하면 형태소 분석 결과 가장 근접한 자동완성 검색을 완성할 수 있을 거로 생각합니다.
쇼핑몰 시현 영상 중: https://youtu.be/xoRRINvt80Q?t=107




"산학연계 프로젝트" 
진행 기간 : 2017.09 ~ 2018.06 (약 9개월) 
주요 내용 : 네이버 서비스 중 일부를 PWA로 재구축
본인이 공헌한 점
	Firebase 스토리지 이미지 업로드/다운로드
	Firebase Firestore의 데이터 송수신
	Create-react-app/Redux/Router을 이용한 React 화면 개발
	PWA(sw-precache sw-toolbox를 통한 정적, 동적 리소스 캐싱)
	PWA 홈 스크린 설치 등등
결과/성과
	Firebase에 대한 전반적인 사용방식 및 구조
	React를 활용한 프론트엔드 개발
	기존 웹과 네이티브 앱과는 다른 패러다임의 PWA 서비스 개발 
학교에서 기업과 연계한 산학 연계 프로젝트입니다. 주제를 선보인 여러 기업 중 네이버가 제안한 주제를 쟁취하여 PWA 서비스 재구축이라는 주제를 진행했습니다. 팀원들과 의견을 나눠본 결과 웹툰을 재구축하기로 하였으며 완성된 PWA 웹툰은 생각과는 다른 퍼포먼스를 드러냈습니다. 웹툰이라는 특성상 메인화면에 200개가 넘는 섬네일 이미지를 띄워야 하는 서비스 선택에도 LightHouse(성능 측정)에서 약 60점대의 퍼포먼스를 기록했습니다. 그 외 PWA의 만족도는 100% 만족하게 할 수 있었습니다.

“개인 기술 블로그”
진행 기간: 2018.09 ~ 진행 중
주요 내용: 개인 블로그 및 포트폴리오 사이트 웹 개발
본인이 공헌한 점
	Create-react-app과 Express를 동시에 개발할 수 있는 환경 구축
	Material UI를 위한 scss 동작 및 실제 Material UI 사용
	React Redux를 통한 상태 관리
	React Router를 통한 요청 경로 및 개발 상태에도 동작 가능한 리다이렉트 기능
결과/성과
	React와 Express를 동시에 개발할 수 있는 환경
	현재 진행 중입니다.
제가 진행했던 프로젝트를 github에 관리하는 것뿐 아니라 제가 사용하고 싶은 기술(스택)로 저만의 사이트를 만들어 제 작품들을 기록하고 싶어 만들고 있는 사이트입니다. 블로그 형태는 현재 진행 중이며 임시로 gitbook을 사용하고 있습니다.


“광운대학교 KW해커톤”
https://github.com/hackathon-kor/2018KWHack
https://drive.google.com/file/d/1FdDv_Mk6yqDrLuNghLn0POq7V0XMBnQX/view?usp=sharing
진행 기간 : 2018.10.26 ~ 2018.10.27(2일)
주요 내용: 겨울을 즐겁게 보낼 수 있는 SW 개발
본인이 공헌한 점
	Firebase Firestore에 데이터를 읽고 쓸 데이터의 모델링
	FE 와 퍼블리싱을 통한 웹 프론트에서의 화면 개발
결과/성과
	2등 수상
SW중심대학 사업단에서 광운대학교에서 진행한 광운대 해커톤입니다. SW 중심대학으로 선정되지 않은 대학생 최소 1명을 함께 팀을 구성하여 진행하는 방식입니다. 안드로이드와 웹 서비스 둘 다 준비 중이었으며 해커톤 특성상 기능을 모두 보여주기 위해선 웹 우선으로 진행하였습니다. 완성된 디자인을 성공적으로 보여주었고 출품작 중 완성도 및 아이디어가 상위권으로 평가되어 준우승하게 되었습니다.



“국방통합데이터센터” SW관리병 - 경영혁신 SW 웹 개발
진행 기간: 2015년 8월 ~ 2016년 2월
주제: 군 기관내에서 사용될 내부 웹 서비스
본인이 공헌한 점
	서버사이드 RESTful 개발
	Angularjs 보조 개발
결과/성과
	웹 개발 프레임워크에 대한 개념 정립
	RESTful 서비스 구축에 대한 이해
	Server Side / Client Side의 분리된 개발의 이해


“광운대 My Engineering Company 스타트업 연계 프로젝트 유안마이”
진행 기간 : 2016년 8월 ~ 2016년 11월
주제: 중국인여행객 및 한국인 가이드를 대상으로 한 플랫폼 웹 서비스 개발
본인이 공헌한 점
	AWS 인프라 구축
	AWS S3 파일 업로드 및 다운로드 
	AWS 무료 HTTPS 인증서 발급 절차
	백엔드(SpringFrameWork)
	프론트엔드(BackboneJS, RequireJS)
결과/성과
	AWS Beanstalk 자동 배포 서비스
	무료 HTTPS 이용
	파일 업로드 및 다운로드 모듈	
	Spring Filter를 통한 웹페이지 및 파일 권한 관리
	RequireJS 모듈 관리, BackboneJS프론트 엔드 화면 개발
