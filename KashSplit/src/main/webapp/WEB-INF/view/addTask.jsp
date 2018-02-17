<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE html>
<!-- Template by html.am -->
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Task Management</title>
		<style type="text/css">
			html, #page { padding:0; margin:0;}
			body { margin:0; padding:0; width:100%; color:#959595; font:normal 12px/2.0em Sans-Serif;}
			h1, h2, h3, h4, h5, h6 {color:darkgreen;}
			#page { background:#fff;}
			#header, #footer, #top-nav, #content, #content #contentbar, #content #sidebar { margin:0; padding:0;}

			/* Logo */
			#logo { padding:0; width:auto; float:left;}
			#logo h1 a, h1 a:hover { color:darkgreen; text-decoration:none;}
			#logo h1 span { color:#BCCE98;}

			/* Header */
			#header { background:#fff; }
			#header-inner { margin:0 auto; padding:0; width:970px;}

			/* Feature */
			.feature { background:green;padding:18px;}
			.feature-inner { margin:auto;width:970px; }
			.feature-inner h1 {color:#DAE9BC;font-size:32px;}

			/* Menu */
			#top-nav { margin:0 auto; padding:0px 0 0; height:37px; float:right;}
			#top-nav ul { list-style:none; padding:0; height:37px; float:left;}
			#top-nav ul li { margin:0; padding:0 0 0 8px; float:left;}
			#top-nav ul li a { display:block; margin:0; padding:8px 20px; color:green; text-decoration:none;}
			#top-nav ul li.active a, #top-nav ul li a:hover { color:#BCCE98;}

			/* Content */
			#content-inner { margin:0 auto; padding:10px 0; width:970px;background:#fff;}
			#content #contentbar { margin:0; padding:0; float:right; width:760px;}
			#content #contentbar .article { margin:0 0 24px; padding:0 20px 0 15px; }
			#content #sidebar { padding:0; float:left; width:200px;}
			#content #sidebar .widget { margin:0 0 12px; padding:8px 8px 8px 13px;line-height:1.4em;}
			#content #sidebar .widget h3 a { text-decoration:none;}
			#content #sidebar .widget ul { margin:0; padding:0; list-style:none; color:#959595;}
			#content #sidebar .widget ul li { margin:0;}
			#content #sidebar .widget ul li { padding:4px 0; width:185px;}
			#content #sidebar .widget ul li a { color:green; text-decoration:none; margin-left:-16px; padding:4px 8px 4px 16px;}
			#content #sidebar .widget ul li a:hover { color:#BCCE98; font-weight:bold; text-decoration:none;}

			/* Footerblurb */
			#footerblurb { background:#DAE9BC;color:green;}
			#footerblurb-inner { margin:0 auto; width:922px; padding:24px;}
			#footerblurb .column { margin:0; text-align:justify; float:left;width:250px;padding:0 24px;}

			/* Footer */
			#footer { background:#fff;}
			#footer-inner { margin:auto; text-align:center; padding:12px; width:922px;}
			#footer a {color:green;text-decoration:none;}

			/* Clear both sides to assist with div alignment  */
			.clr { clear:both; padding:0; margin:0; width:100%; font-size:0px; line-height:0px;}

			.myTable { width:400px;background-color:#eee;border-collapse:collapse; }
			.myTable th { background-color:#000;color:white;width:50%; }
			.myTable td, .myTable th { padding:5px;border:1px solid #000; }
		</style>
		<script type="text/javascript">
			/* =============================
			This script generates sample text for the body content.
			You can remove this script and any reference to it.
			 ============================= */
			var bodyText=["The smaller your reality, the more convinced you are that you know everything.", "If the facts don't fit the theory, change the facts.", "The past has no power over the present moment.", "This, too, will pass.", "</p><p>You will not be punished for your anger, you will be punished by your anger.", "Peace comes from within. Do not seek it without.", "<h2>Heading</h2><p>The most important moment of your life is now. The most important person in your life is the one you are with now, and the most important activity in your life is the one you are involved with now."]
			function generateText(sentenceCount){
				for (var i=0; i<sentenceCount; i++)
				document.write(bodyText[Math.floor(Math.random()*7)]+" ")
			}

			var contentText="Sample Content Text."

			function generateContentText(){
				document.write(contentText+" ")
			}

		</script>
	</head>
	<body>
		<div id="page">
			<header id="header">
				<div id="header-inner">
					<div id="logo">
						<h1><a href="/">Task<span>Management</span></a></h1>
					</div>
					<div id="top-nav">
						<ul>
						<li><a href="#">About</a></li>
						<li><a href="#">Settings</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Help</a></li>
						</ul>
					</div>
					<div class="clr"></div>
				</div>
			</header>
			<div class="feature">
				<div class="feature-inner">
				<h1>Create a task</h1>
				</div>
			</div>


			<div id="content">
				<div id="content-inner">

					<main id="contentbar">
						<div class="article">
							<!-- <p><script>generateText(12)</script></p> -->
							<form:form action="../../task/new" modelAttribute="taskForm">
								<table class="myTable">
									<tr>
										<th colspan="2">Create Task</th>
									</tr>
									<tr>
										<td>Task Name:</td>
										<td><form:input path="taskName" /><br><br></td>
									</tr>
									<tr>
										<td>Description:</td>
										<td><br> <form:input path="taskDescription" /><br> <br></td>
									</tr>
									<tr>
										<td>Label:</td>
										<td><br> <form:input path="label" /><br> <br></td>
									</tr>
									<tr>
										<td align="center" colspan="2"><br> <input type="submit"
											value="Create" /><br> <br></td>
									</tr>
								</table>
							</form:form>
						</div>
					</main>

					<nav id="sidebar">
						<div class="widget">
							<h3>Tasks</h3>
							<ul>
							<li><a href="../task/show/new">Add a Task</a></li>
							<li><a href="../task/update">Update Tasks</a></li>
							<li><a href="../task/delete">Delete Tasks</a></li>
							<li><a href="../task/pending">View Pending Tasks</a></li>
							<li><a href="../task/completed">View Completed Tasks</a></li>
							<li><a href="../task/download">Download Tasks</a></li>
						</div>
					</nav>

					<div class="clr"></div>
				</div>
			</div>

			<div id="footerblurb">
				<div id="footerblurb-inner">

					<div class="column">
						<h2><span>Heading</span></h2>
						<p><script>generateContentText()</script></p>
					</div>
					 <div class="column">
						<h2><span>Heading</span></h2>
						<p><script>generateContentText()</script></p>
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
					<p>&copy; Copyright <a href="#">Your Site</a> &#124; <a href="#">Terms of Use</a> &#124; <a href="#">Privacy Policy</a></p>
					<div class="clr"></div>
				</div>
			</footer>
		</div>
	</body>
</html>