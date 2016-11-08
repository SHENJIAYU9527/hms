<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome</title>
</head>
<body>

	<div id="example"></div>

	
	
	
	<script src="js/reactjs/react.js" type="text/javascript"></script>
	<script src="js/reactjs//react-dom.js" type="text/javascript"></script>
	<script src="js/reactjs/browser.min.js" type="text/javascript"></script>
	<script type="text/babel">
       //1.ReactDOM.render 是 React 的最基本方法，用于将模板转为 HTML 语言，并插入指定的 DOM 节点。
	    ReactDOM.render(
          <h1>Hello, world!</h1>,
          document.getElementById('example')
        );
	   //2.HTML 语言直接写在 JavaScript 语言之中，不加任何引号，这就是 JSX 的语法，它允许 HTML 与 JavaScript 的混写
       var names=['Alice','Emily','Kate'];
	   ReactDOM.render(
		 <div>
		{
		  names.map(function(name){
			return <div>Hello,{name}!</div>
			})
		}
		</div>,
		document.getElementById('example')
       );
       //3.JSX 允许直接在模板插入 JavaScript 变量。如果这个变量是一个数组，则会展开这个数组的所有成员
       var arr = [
         <h1>Hello world!</h1>,
         <h2>React is awesome</h2>,
       ];

       ReactDOM.render(
         <div>{arr}</div>,
         document.getElementById('example')
       );
	   //4.React 允许将代码封装成组件（component），然后像插入普通 HTML 标签一样，在网页中插入这个组件。React.createClass 方法就用于生成一个组件类
       var HelloMessage=React.createClass({
		 render:function(){
		   return <h1>Hello {this.props.name}</h1>;
         }
       });
       ReactDOM.render(
		<HelloMessage name="Ningkai"/>,
		document.getElementById('example')
       );




    </script>
</body>
</html>