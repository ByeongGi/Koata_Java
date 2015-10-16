<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML lang="kr">
<HEAD>
<TITLE>2013 / 2013. 8. 9. /</TITLE>
<meta charset="UTF-8">
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<style>
li {
	list-style: none
}

.faq {
	padding: 20px 30px 0 20px
}

.faq h4 {
	border-top: 1px solid #ddd
}

.faq h4 a {
	display: inline-block;
	padding: 15px;
	font-size: 14px;
	color: #555;
	text-decoration: none
}

.faq h4 a:hover {
	color: #3273b3
}

.faq div {
	padding: 0 15px 15px;
	line-height: 20px
}
.on
</style>
<script type="text/javascript">
$(function() {
	var $triger2 = $('.faq > h4 > a');
	var $content2 = $('.faq > div');
	
	$content2.hide();
	$triger2.parent().first().css('borderTop','none');
	
	$triger2.click(function() {
		
		var $this = $(this).parent();
		$triger2.parent().removeClass("on");
		$content2.slideUp(150);
		if ($this.next().is(':hidden')) {
			$triger2.each(function(i) {
				$this.addClass("on");
				$this.next().eq(i).slideDown(150);
			})
		}
	});
	
	
	
	
	
});
</script>
</HEAD>
<body>
	<!-- 

 -->
	<div class="faq">

		<h4>
			<a href="#none">[1]Test title1</a>
		</h4>
		<div>
			<ul class="list_bul">
				<li>test<span>2009.11~2011.08</span></li>
				<li>test<span>2006.07~2009.10</span></li>
				<li>test<span>2000.06~2006.06</span></li>
				<li>test<span>1999.03~2000.06</span></li>
			</ul>
			<h3 class="top3">Test title2</h3>
			<ul class="list_bul">
				<li>test<span>2011</span></li>
				<li>test<span>2011</span></li>
				<li>test<span>2009.11~2011.08</span></li>
				<li>test<span>2006.07~2009.10</span></li>
				<li>test<span>2000.06~2006.06</span></li>
				<li>test<span>1999.03~2000.06</span></li>
			</ul>
			<h3 class="top3">저서</h3>
			<ul class="list_bul">
				<li>test111111<span>2011</span></li>
			</ul>
			<br /> <br /> <br /> <br />
			<p class="bdr_line"></p>
		</div>

		<h4>
			<a href="#none">[2]Test title1</a>
		</h4>
		<div>
			Test1.<br /> Test1.<br /> Test1.<br /> Test1.<br /> Test1.<br />
			Test1.<br />

		</div>
		<h4>
			<a href="#none">[3]Test title2</a>
		</h4>
		<div>
			Test2.<br /> Test2.<br /> Test2.<br /> Test1.<br /> Test1.<br />
			Test2.<br />

		</div>

	</div>

</body>
</html>