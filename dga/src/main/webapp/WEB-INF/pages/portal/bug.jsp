<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="padding:10px;">
<div style="margin-bottom:8px;">您的意见会让系统做得更好<br /></div>
<form id="bug_form" method="post" enctype="application/x-www-form-urlencoded">
<textarea name="msg" id="msg" cols="50" rows="7" style=" border:solid 3px #E2E2E2;line-height:16px; padding:5px;"></textarea>
<br />
<div style="margin-top:8px;"><a href="javascript:void(0);" onclick="$('#bug_form').submit();" id="bug_form_but" class="easyui-linkbutton">提交</a></div>
</form>
</div>
<script>
//功能相对独立，应该单独放置
$('#bug_form').form({  
	url:"saveBug2.action",  
	onSubmit: function(){  
		if($('#msg').val()==""){
			$.messager.alert('Warning',"内容太少");	
			return false;
		}else{
		$.ajax({
        type: "post",
        dataType: "text",
       // url: '1.action',
        data: $('#msg').val(),
        success:function(data){  
		$.messager.alert('Warning',"反馈已提交！"); 
		$('#msg').val("");
	}  
        
    });
		}
	}, 
	/* success:function(data){  
		$.messager.alert('Warning',"11"); 
		$('#msg').val("");
	}   */
});   
</script>