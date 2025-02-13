<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>地址管理</title>

		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="css/personal.css" rel="stylesheet" type="text/css">
		<link href="css/addstyle.css" rel="stylesheet" type="text/css">
		<script src="AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
		<script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
<script>
	var dataJson;
	$(function(){
		$.ajax({
			//加载最外层的父节点
			dataType:'json',
			type:'post',
			url:'loadArea',
			//data:{'parentId':-100},
			async:false,//同步
			success:function(data){
				//console.log(data);
				//首先来说我需要取到我的对应的第一层的父级节点信息
				dataJson=data;
				var areaName=[];//区域名字
				var areaId=[];//区域id
				for(var i=0;i<data.length;i++){
					//证明这个json数据就是我需要的，因为最外层的省级的parentId就是-100
					if(data[i].area_parent_id=='-100'){
						areaName[i]=data[i].area_name;
						areaId[i]=data[i].area_id;
					}
				}
				var str="<option value=\"null\" selected>--请选择省份--</option>";
				for(var i=0;i<areaName.length;i++){
					if(areaName[i]!=undefined){
						//console.log('abc');
						//console.log(areaName[i]);
						str+="<option value="+areaId[i]+">"+areaName[i]+"</option>";
					}
				}
				$("#selectProvince").html(str);
			}



		});

	})

	//改变省份
	function changeProvince(){
		//console.log(123);
		var provinceId=$("#selectProvince").val();//拿到省份的值
		if(provinceId=='null'){
			//alert('请选择省份');
			console.log('请选择省份');
		}else{
			//alert('你选择了'+provinceId);
			//我就拿到了用户选择的省份的ID
			//根据我这个省份的ID来进行相关的操作
			//这个时候不需要在请求ajax了，因为我们现在的思路是整个数据已经全部返回过来了
			console.log(dataJson);//拿到通过一开始的ajax返回的json数据，接下来我就可以根据
			//第一次选择的省份来进行城市的数据加载
		//	var areaName=[];//定义名称的数组
			//var areaId=[];//定义areaId的数组
			var str="<option value=\"null\" selected>--请选择市--</option>";
			for(var i=0;i<dataJson.length;i++){
				//console.log(dataJson);
				if((dataJson[i].area_name!=undefined)&(dataJson[i].area_parent_id==provinceId)){
					console.log(dataJson[i].area_name);
					//console.log('abc');
					//console.log(areaName[i]);
					str+="<option value="+dataJson[i].area_id+">"+dataJson[i].area_name+"</option>";
				}
			}
			$("#selectCity").html(str);
		}
	}
</script>
	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd">
									<#if Session["user"]?exists>
										<a href="#" target="_top" class="h">亲,${user.userEmail}|登录成功</a>
										<a href="#" target="_top">免费注册</a>
									<#else>
										<a href="#" target="_top" class="h">亲，请登录</a>
										<a href="#" target="_top">免费注册</a>
									</#if>
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
							</div>
							<div class="topMessage my-shangcheng">
								<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
							</div>
							<div class="topMessage mini-cart">
								<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
						</ul>
						</div>

						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>

		<div class="nav-table">
			<div class="long-title"><span class="all-goods">全部分类</span></div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="#">首页</a></li>
					<li class="qc"><a href="#">闪购</a></li>
					<li class="qc"><a href="#">限时抢</a></li>
					<li class="qc"><a href="#">团购</a></li>
					<li class="qc last"><a href="#">大包装</a></li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>
		</div>
		<b class="line"></b>

		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-address">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small></div>
						</div>
						<hr/>
						<ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
							<#if list?? && (list?size > 0)>
								<#list list as list1>
									<#if  1 == '${list1.userAddressStatus}'>
										<li class="user-addresslist defaultAddr">
											<span class="new-option-r"><i class="am-icon-check-circle"></i>默认地址</span>
								<p class="new-tit new-p-re">
									<span class="new-txt">${list1.userAddressPeople}</span>
									<span class="new-txt-rd2">${list1.userPhone}</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p class="new-mu_l2cw">
										<span class="title">地址：</span>
										<span class="province">${list1.userAddress}</span>
										<!--
										<span class="province">湖北</span>省
										<span class="city">武汉</span>市
										<span class="dist">洪山</span>区
										<span class="street">雄楚大道666号(中南财经政法大学)</span></p>
										-->
									</p>
								</div>
								<div class="new-addr-btn">
									<a href="#"><i class="am-icon-edit"></i>编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:void(0);" onClick="delClick(this);"><i class="am-icon-trash"></i>删除</a>
								</div>
							</li>
								<#else>
							<li class="user-addresslist">
								<span class="new-option-r"><i class="am-icon-check-circle"></i><a href="updateUserAddress?userAddressId=${list1.userAddressId}&userEmail=${list1.userEmail}">设为默认</a></span>
								<p class="new-tit new-p-re">
									<span class="new-txt">${list1.userAddressPeople}</span>
									<span class="new-txt-rd2">${list1.userPhone}</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p class="new-mu_l2cw">
										<span class="title">地址：</span>
										<span class="province">${list1.userAddress}</span>
									</p>
								</div>
								<div class="new-addr-btn">
									<a href="#"><i class="am-icon-edit"></i>编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:void(0);" onClick="delClick(this);"><i class="am-icon-trash"></i>删除</a>
								</div>
							</li>
							</#if>
							</#list>
							<#else>
							暂无地址
							</#if>


						</ul>
						<div class="clear"></div>
						<a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
						<!--例子-->
						<div class="am-modal am-modal-no-btn" id="doc-modal-1">

							<div class="add-dress">

								<!--标题 -->
								<div class="am-cf am-padding">
									<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add&nbsp;address</small></div>
								</div>
								<hr/>

								<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
									<form class="am-form am-form-horizontal">

										<div class="am-form-group">
											<label for="user-name" class="am-form-label">收货人</label>
											<div class="am-form-content">
												<input type="text" id="user-name" placeholder="收货人">
											</div>
										</div>

										<div class="am-form-group">
											<label for="user-phone" class="am-form-label">手机号码</label>
											<div class="am-form-content">
												<input id="user-phone" placeholder="手机号必填" type="email">
											</div>
										</div>
										<div class="am-form-group">
											<label for="user-address" class="am-form-label">所在地</label>
											<div class="am-form-content address">
												<select data-am-selected class="selectProvince" id="selectProvince" onchange="changeProvince();">
													正在加载数据...请稍后...
												</select>
												<select data-am-selected class="selectCity" id="selectCity">
													<option value="null" selected>--请选择市--</option>
												</select>
												<select data-am-selected class="selectArea" id="selectArea">
													<option value="null">--请选择区--</option>
												</select>
											</div>
										</div>

										<div class="am-form-group">
											<label for="user-intro" class="am-form-label">详细地址</label>
											<div class="am-form-content">
												<textarea class="" rows="3" id="user-intro" placeholder="输入详细地址"></textarea>
												<small>100字以内写出你的详细地址...</small>
											</div>
										</div>

										<div class="am-form-group">
											<div class="am-u-sm-9 am-u-sm-push-3">
												<a class="am-btn am-btn-danger">保存</a>
												<a href="javascript: void(0)" class="am-close am-btn am-btn-danger" data-am-modal-close>取消</a>
											</div>
										</div>
									</form>
								</div>

							</div>

						</div>

					</div>

					<script type="text/javascript">
						$(document).ready(function() {							
							$(".new-option-r").click(function() {
								$(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
							});
							
							var $ww = $(window).width();
							if($ww>640) {
								$("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
							}
							
						})
					</script>

					<div class="clear"></div>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有</em>
						</p>
					</div>
				</div>
			</div>

			<aside class="menu">
				<ul>
					<li class="person">
						<a href="main.ftl">个人中心</a>
					</li>
					<li class="person">
						<a href="#">个人资料</a>
						<ul>
							<li> <a href="information.html">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li class="active"> <a href="address.html">收货地址</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的交易</a>
						<ul>
							<li><a href="order.html">订单管理</a></li>
							<li> <a href="change.html">退款售后</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的资产</a>
						<ul>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<a href="#">我的小窝</a>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>
							<li> <a href="comment.html">评价</a></li>
							<li> <a href="news.html">消息</a></li>
						</ul>
					</li>

				</ul>

			</aside>
		</div>


	</body>

</html>