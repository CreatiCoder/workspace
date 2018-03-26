# Create React Pwa App with AMP

### 1. Create React App

```bash
create-react-app pwa-amp
```

### 2. Firebase init

```bash
firebase init
# public -> build
```

### 3. Setting init

- .prettierrc

  ```json
  {
    "proseWrap" : "always",
    "singleQuote" : true,
    "tabWidth" : 4,
    "printWidth" : 120,
    "parser" : "flow",
    "trailingComma" : "es5",
    "jsxBracketSameLine": false
  }
  ```

- .editorconfig

  ```
  root = true
  [*.css]
  indent_style = tab
  indent_size = 2
  end_of_line = lf
  charset = utf-8
  trim_trailing_whitespace = true
  insert_final_newline = true
  max_line_length = 80
  [*.js]
  indent_style = tab
  indent_size = 4
  end_of_line = lf
  charset = utf-8
  trim_trailing_whitespace = true
  insert_final_newline = true
  max_line_length = 80
  [*.html]
  indent_style = tab
  indent_size = 2
  end_of_line = lf
  charset = utf-8
  trim_trailing_whitespace = true
  insert_final_newline = true
  max_line_length = 80
  ```

### 4. Amp

- index.html - head 태그 안에 추가

  ```html
  <meta name="viewport" content="width=device-width,minimum-scale=1,initial-scale=1, shrink-to-fit=no">

  <script async src="https://cdn.ampproject.org/v0.js"></script>

  <link rel="canonical" href="index.html">
  <style amp-boilerplate>
        body{-webkit-animation:-amp-start 8s steps(1,end) 0s 1 normal both;-moz-animation:-amp-start 8s steps(1,end) 0s 1 normal both;-ms-animation:-amp-start 8s steps(1,end) 0s 1 normal both;animation:-amp-start 8s steps(1,end) 0s 1 normal both}@-webkit-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-moz-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-ms-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-o-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}
  </style>
  <noscript>
    <style amp-boilerplate>
      body{-webkit-animation:none;-moz-animation:none;-ms-animation:none;animation:none}
    </style>
  </noscript>
  <style amp-custom>
    amp-img {
      margin: 0.5em;
    }
    body {
      max-width: 900px;
    }
  </style>
  ```

  ​

- App.js - react 컴포넌트의 render() 내부에 추가

  ```html
  <amp-img
  	src="https://www.ampproject.org/examples/images/amp.jpg"
  	width="900"
  	height="508"
  	layout="responsive"
  />
  ```

  ​