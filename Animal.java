package com.nadan.java.animal;

//�߻� Ŭ������ �����Ѵ�. ��ü�� ����� �� ���� ���� ����� ���ؼ� ����Ѵ�. ������ �������� �Ӽ��� �����Ѵ�.
public abstract class Animal {
	
	public String kind;
	
	//��� ������ ���� ���� �Ӽ��� ������
	public void breathe(){
		System.out.println("���� ���ϴ�");
	}
	
	//�Ҹ��� �پ��ϱ� ������ �߻� �޼ҵ�� �����Ѵ�.
	public abstract void sound();
	
	

}
