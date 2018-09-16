package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g  = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("½ºÇÁ¸µ");
		System.out.println(msg);
		ctx.close();
	}

}
