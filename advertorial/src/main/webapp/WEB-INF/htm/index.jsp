<html>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
function test() {
	alert(jQuery("#test1").val());
}
</script>
<body>
<h2>Hello World!</h2>
<input type="text" id="test1" name="test1" />
<input type="button" onclick="test();" value="click"/>
</body>
</html>
