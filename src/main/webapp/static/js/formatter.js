function statusFormatter(value, row) {
	if(value == 0)
		return '<div class="silk-user_green"/>' + "正常";
	if(value == 1)
		return  "未激活";
	if(value == 2)
		return '<div class="silk-user_delete"/>' + "冻结";
	return '<i class="silk-error"/>' + '错误';
}

function thumbFormatter(value, row){
	
	return "<a class='colorbox' target='_blank' href='/upload/" + row.FILE_PATH + "' alt='大图'><img src='/upload/" + value + "' alt='img'/></a>";
}