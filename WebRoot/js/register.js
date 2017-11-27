
function check(form) {
	var name = form.name.value;
	var age = form.age.value;
	var sex = "";
	var edu = form.education.value;
	var hobby = "";
	var email = form.email.value;
	
	if (name == "") {
		alert("名字不能为空！");
		form.name.focus();
		return false;
	}

	if (age != "") {
		if(!isNaN(age)) {
			if(1 > parseInt(age) || parseInt(age) > 120) {
				alert('你的年龄过大！');
				return false;
			}
		} else {
			alert('年龄请输入数字！');
			return false;
		}
	} else {
		alert("年龄不能为空！");
	}
	
	
	if (form.sex[0].checked) {
		sex = form.sex[0].value;
	} else {
		sex = form.sex[1].value;
	}
	
	for(var i = 0; i < form.hobby.length; i+=1) {
		if (form.hobby[i].checked) {
			if (hobby != "") {
				hobby += ',';
			}
			hobby += form.hobby[i].value;
		}
	}
	
	if (email.indexOf('@') < 1 || email.indexOf('.') < 1) {
		alert('电子邮件格式不正确!');
		form.email.focus();
		return false;
	}
	
	alert("name = " + name + "; age = " + age + "; sex = " + sex + "; hobby = " + hobby + "; edu = " + edu + "; email = " + email);
	//location.href("../message.jsp");
	return false;			
}

function Onclick() {
	alert("onClick");
}