<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- Template by html.am -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Task Management</title>
<style type="text/css">
html, #page {
	padding: 0;
	margin: 0;
}

body {
	margin: 0;
	padding: 0;
	width: 100%;
	color: #959595;
	font: normal 12px/2.0em Sans-Serif;
}

h1, h2, h3, h4, h5, h6 {
	color: darkgreen;
}

#page {
	background: #fff;
}

#header, #footer, #top-nav, #content, #content #contentbar, #content #sidebar
	{
	margin: 0;
	padding: 0;
}

/* Logo */
#logo {
	padding: 0;
	width: auto;
	float: left;
}

#logo h1 a, h1 a:hover {
	color: darkgreen;
	text-decoration: none;
}

#logo h1 span {
	color: #BCCE98;
}

/* Header */
#header {
	background: #fff;
}

#header-inner {
	margin: 0 auto;
	padding: 0;
	width: 970px;
}

/* Feature */
.feature {
	background: green;
	padding: 18px;
}

.feature-inner {
	margin: auto;
	width: 970px;
}

.feature-inner h1 {
	color: #DAE9BC;
	font-size: 32px;
}

/* Menu */
#top-nav {
	margin: 0 auto;
	padding: 0px 0 0;
	height: 37px;
	float: right;
}

#top-nav ul {
	list-style: none;
	padding: 0;
	height: 37px;
	float: left;
}

#top-nav ul li {
	margin: 0;
	padding: 0 0 0 8px;
	float: left;
}

#top-nav ul li a {
	display: block;
	margin: 0;
	padding: 8px 20px;
	color: green;
	text-decoration: none;
}

#top-nav ul li.active a, #top-nav ul li a:hover {
	color: #BCCE98;
}

/* Content */
#content-inner {
	margin: 0 auto;
	padding: 10px 0;
	width: 970px;
	background: #fff;
}

#content #contentbar {
	margin: 0;
	padding: 0;
	float: right;
	width: 760px;
}

#content #contentbar .article {
	margin: 0 0 24px;
	padding: 0 20px 0 15px;
}

#content #sidebar {
	padding: 0;
	float: left;
	width: 200px;
}

#content #sidebar .widget {
	margin: 0 0 12px;
	padding: 8px 8px 8px 13px;
	line-height: 1.4em;
}

#content #sidebar .widget h3 a {
	text-decoration: none;
}

#content #sidebar .widget ul {
	margin: 0;
	padding: 0;
	list-style: none;
	color: #959595;
}

#content #sidebar .widget ul li {
	margin: 0;
}

#content #sidebar .widget ul li {
	padding: 4px 0;
	width: 185px;
}

#content #sidebar .widget ul li a {
	color: green;
	text-decoration: none;
	margin-left: -16px;
	padding: 4px 8px 4px 16px;
}

#content #sidebar .widget ul li a:hover {
	color: #BCCE98;
	font-weight: bold;
	text-decoration: none;
}

/* Footerblurb */
#footerblurb {
	background: #DAE9BC;
	color: green;
}

#footerblurb-inner {
	margin: 0 auto;
	width: 922px;
	padding: 24px;
}

#footerblurb .column {
	margin: 0;
	text-align: justify;
	float: left;
	width: 250px;
	padding: 0 24px;
}

/* Footer */
#footer {
	background: #fff;
}

#footer-inner {
	margin: auto;
	text-align: center;
	padding: 12px;
	width: 922px;
}

#footer a {
	color: green;
	text-decoration: none;
}

/* Clear both sides to assist with div alignment  */
.clr {
	clear: both;
	padding: 0;
	margin: 0;
	width: 100%;
	font-size: 0px;
	line-height: 0px;
}

.myTable {
	width: 400px;
	background-color: #eee;
	border-collapse: collapse;
}

.myTable th {
	background-color: #000;
	color: white;
	width: 50%;
}

.myTable td, .myTable th {
	padding: 5px;
	border: 1px solid #000;
}
</style>
<script type="text/javascript">
	/* =============================
	This script generates sample text for the body content.
	You can remove this script and any reference to it.
	 ============================= */
	var bodyText = [
			"The smaller your reality, the more convinced you are that you know everything.",
			"If the facts don't fit the theory, change the facts.",
			"The past has no power over the present moment.",
			"This, too, will pass.",
			"</p><p>You will not be punished for your anger, you will be punished by your anger.",
			"Peace comes from within. Do not seek it without.",
			"<h2>Heading</h2><p>The most important moment of your life is now. The most important person in your life is the one you are with now, and the most important activity in your life is the one you are involved with now." ]
	function generateText(sentenceCount) {
		for (var i = 0; i < sentenceCount; i++)
			document.write(bodyText[Math.floor(Math.random() * 7)] + " ")
	}

	var contentText = "Sample Content Text."

	function generateContentText() {
		document.write(contentText + " ")
	}
</script>
</head>
<body>
	<div id="page">
		<header id="header">
			<div id="header-inner">
				<div id="logo">
					<h1>
						<a
							href="/">Task<span>Management</span></a>
					</h1>
				</div>
				<div id="top-nav">
					<ul>
						<li><a href="#">About</a></li>
						<li><a href="#">Settings  <i class="fa fa-cogs"></i></a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Help</a></li>
					</ul>
				</div>
				<div class="clr"></div>
			</div>
		</header>
		<div class="feature">
			<div class="feature-inner">
				<h1>your Task manager</h1>
			</div>
		</div>


		<div id="content">
			<div id="content-inner">

				<main id="contentbar">
				<div class="article">
					<!-- <p><script>generateText(12)</script></p> -->
					<!--<table class="myTable">
									<tr>
										<th>Table Header</th><th>Table Header</th>
									</tr>
									<tr>
										<td>Table cell 1</td><td>Table cell 2</td>
									</tr>
									<tr>
										<td>Table cell 3</td><td>Table cell 4</td>
									</tr>
								</table> -->
					Welcome
					<h3>${username}</h3>

					<a href="nextPage">Next Page</a>
				</div>
				</main>

				<nav id="sidebar">
					<div class="widget">
						<h3><i class="fa fa-list-alt"></i>  Tasks</h3>
						<ul>
							<li><a href="../task/show/new"><i class="fa fa-plus-square-o"></i>  Add a Task</a></li>
							<li><a href="../task/update"><i class="mega-octicon octicon-diff-modified"></i>  Update Tasks</a></li>
							<li><a href="../task/delete"><i class="fi-trash"></i>  Delete Tasks</a></li>
							<li><a href="../task/pending"><i class="mega-octicon octicon-checklist"></i>  View Pending Tasks</a></li>
							<li><a href="../task/completed"><i class="glyphicon glyphicon-ok"></i>  View Completed Tasks</a></li>
							<li><a href="../task/download"><i class="fi-download"></i>  Download Tasks</a></li>
						</ul>
					</div>
				</nav>

				<div class="clr"></div>
			</div>
		</div>

		<div id="footerblurb">
			<div id="footerblurb-inner">

				<div class="column">
					<h2>
						<span>Heading</span>
					</h2>
					<p>
						<script>
							generateContentText()
						</script>
					</p>
				</div>
				<div class="column">
					<h2>
						<span>Heading</span>
					</h2>
					<p>
						<script>
							generateContentText()
						</script>
					</p>
				</div>
				<!--<div class="column">
						<h2><span>Heading</span></h2>
						<p><script>generateText(2)</script></p>
					</div> -->

				<div class="clr"></div>
			</div>
		</div>
		<footer id="footer">
			<div id="footer-inner">
				<p>
					&copy; Copyright <a href="#">Your Site</a> &#124; <a href="#">Terms
						of Use</a> &#124; <a href="#">Privacy Policy</a>
				</p>
				<div class="clr"></div>
			</div>
		</footer>
	</div>
</body>
</html>