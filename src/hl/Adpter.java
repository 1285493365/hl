package hl;

public class Adpter extends Adptee implements IStandentElec {

	@Override
	public void ServiceElec() {
		// TODO Auto-generated method stub
		super.ServiceElec();
		System.out.println("开始转换为110V电压");
		System.out.println("110V电压转换成功，可以开始使用了...");
	}
	 
}
