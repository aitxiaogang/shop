package com.xiaogang.shop.util;

import com.xiaogang.shop.constants.Gender;

public class NameUtil {
	private static String[] firstName = {"赵","钱","孙","李","周","吴","郑","王","冯","陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许","何","吕","施","张","孔","曹","严","华","金","魏","陶","姜","戚","谢","邹","喻","柏","水","窦","章","云","苏","潘","葛","奚","范","彭","郎","鲁","韦","昌","马","苗","凤","花","方","俞","任","袁","柳","酆","鲍","史","唐","费","廉","岑","薛","雷","贺","倪","汤","滕","殷","罗","毕","郝","邬","安","常","乐","于","时","傅","皮","卞","齐","康","伍","余","元","卜","顾","孟","平","黄","和","穆","萧","尹","姚","邵","湛","汪","祁","毛","禹","狄","米","贝","明","臧","计","伏","成","戴","谈","宋","茅","庞","熊","纪","舒","屈","项","祝","董","梁","杜","阮","蓝","闵","席","季","麻","强","贾","路","娄","危","江","童","颜","郭"};
	private static String[] girlLastName = {"婷","欣","玲","结","静","仪","怡","雨","思","雯","华","家","嘉","豪","皓","浩","子","慧"};
	private static String[] manLastName = {"浩","豪","皓","鹏","铭","雄","宏","洪","鸿","樊","升","津","辉","勇","永","嘉懿","煜城","懿轩","烨伟","苑博","伟泽","熠彤","鸿煊","博涛","烨霖","烨华","煜祺","智宸","正豪","昊然","明杰","立诚","立轩","立辉","峻熙","弘文"};
	
	public static String buildName(Gender gender){
		Integer randomNum = NumberUtil.randomNumLessThat(firstName.length,firstName.length);
		String fn = firstName[randomNum];
		if (gender == Gender.MAN) {
			Integer manRandom = NumberUtil.randomNumLessThat(manLastName.length,manLastName.length);
			String string = manLastName[manRandom];
			return fn+string;
		}else if(gender == Gender.WOMAN){
			Integer womanRandom = NumberUtil.randomNumLessThat(girlLastName.length,girlLastName.length);
			String string = girlLastName[womanRandom];
			return fn+string;
		}
		return null;
	}
	private NameUtil(){}
}
