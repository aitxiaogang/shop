<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="/static/css/index.css" rel="stylesheet" type="text/css" />
<title>成都蓝源进销存系统(教学版)-系统主页</title>
</head>

<body>

	<div class="container">
		<div class="head">
			<div class="head-left">
				<span style="font-weight: bold; color: #1f4906">欢迎您-</span><br>
				<span style="color: #4a940d;">XuLi</span>
			</div>
			<div class="head-right">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="32%"><a href="#"><img src="/static/images/head-l.gif"
								border="0"></a></td>
						<td width="26%"><a href="#"><img src="/static/images/head-m.gif"
								border="0"></a></td>
						<td width="7%">&nbsp;</td>
						<td width="35%"><a href="#"><img src="/static/images/head-r.gif"
								border="0"></a></td>
					</tr>
				</table>

			</div>
		</div>
		<!--"head"end-->

		<div class="content">
			<div class="left">
				<div style="margin-left: 2px;">
					<img src="/static/images/left-top.gif" width="162" height="25">
				</div>
				<div class="left-bottom">
					<div class="left-text">
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td height="22"><a class="hei" href="purchaseBill.html"
									target="main">采购订单</a></td>
							</tr>
							<tr>
								<td height="20"><a class="hei" href="purchaseBillItem.html"
									target="main">采购报表</a></td>
							</tr>
							<tr>
								<td height="58" valign="bottom"><a class="hei"
									href="order_o.html" target="main">销售订单</a></td>
							</tr>
							<tr>
								<td height="20"><a class="hei" href="#">销售出库</a></td>
							</tr>
							<tr>
								<td height="18"><a class="hei" href="#">销售退货</a></td>
							</tr>
							<tr>
								<td height="55" valign="bottom"><a class="hei" href="#">库存查询</a></td>
							</tr>
							<tr>
								<td height="24"><a class="hei" href="#">库存预警</a></td>
							</tr>
							<tr>
								<td height="50" valign="bottom"><a class="hei" href="/usr/list" target="main">员工</a></td>
							</tr>
							<tr>
								<td height="23"><a class="hei" href="#">供应商</a></td>
							</tr>
							<tr>
								<td height="18"><a class="hei" href="product_p.html"
									target="main">产品</a></td>
							</tr>
						</table>

					</div>
				</div>
				<!--"left-bottom"end-->
			</div>
			<!--"left"end-->

			<iframe src="/main_m.do"
				style="width: 848px; float: right; height: 530px" scrolling="no"
				name="main" frameborder="0"></iframe>
			<!--"content-right"end-->
		</div>
		<!--"content"end-->
		<div class="footer">
			<div style="margin-top: 5px;">
				<table width="98%" border="0" cellpadding="0" cellspacing="0"
					align="center">
					<tr>
						<td width="82%"><img src="/static/images/icon_1.gif">&nbsp;<a
							class="lanyo" href="www.lanyotech.com">蓝源信息技术 2009</a></td>
						<td width="18%" valign="middle"><img src="/static/images/icon_2.gif">&nbsp;<a
							class="lanyo" href="#">如有疑问请与技术人员联系</a></td>
					</tr>
				</table>
			</div>

		</div>
		<!--"footer"end-->
	</div>
	<!--"container"end-->

</body>
</html>