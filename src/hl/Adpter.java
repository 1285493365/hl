package hl;

public class Adpter extends Adptee implements IStandentElec {

	@Override
	public void ServiceElec() {
		// TODO Auto-generated method stub
		super.ServiceElec();
		System.out.println("��ʼת��Ϊ110V��ѹ");
		System.out.println("110V��ѹת���ɹ������Կ�ʼʹ����...");
	}
	 
}
