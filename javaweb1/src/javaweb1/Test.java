package javaweb1;

public class Test {

	public static void main(String[] args) {
		Student stu = new Student("С��ͬѧ","��");
		Student stu1 = new Student("�ŷ�","��");
		Teacher tea = new Teacher("������ʦ","��");
		Study sdy = new Study();
		Tour to = new Tour();
		Teach te = new Teach();
        Address addr1 = new Address();
        Address addr2 = new Address();
        Address addr3 = new Address();
        	addr1.setName("տ��");
        	addr2.setName("����");
        	addr3.setName("����");
        	stu.dosomething(sdy, addr1);
            tea.dosomething(te, addr2);
            stu1.dosomething(to, addr3);
       	
}
}
