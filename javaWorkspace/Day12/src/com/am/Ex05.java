package com.am;

class MyLink {
	Node first;
	int cnt;

	int size() {
		return cnt;
	}

	private class Node {
		int val;
		Node nxt;
	}

	int get(int idx) {
//		0	first.val;
//		1	first.nxt.val;
//		2	first.nxt.nxt.val;

		Node temp = first;
		for (int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		return temp.val;
	}

	void add(int su) {
		cnt++;
//		1.
		if (cnt == 1) {
			first = new Node();
			first.val = su;
		} else {
			Node temp2 = new Node();
			temp2.val = su;
			Node temp = first;
			while (true) {
				if (temp.nxt == null)
					break;
				temp = temp.nxt;
			}
			temp.nxt = temp2;
		}

//		3.
//		Node temp3=new Node();
//		temp3.val=su;
//		first.nxt.nxt=temp3;

//		4.
//		Node temp4=new Node();
//		temp4.val=su;
//		first.nxt.nxt.nxt=temp4;

//		5.
//		Node temp5=new Node();
//		temp5.val=su;
//		first.nxt.nxt.nxt.nxt=temp5;
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		�Է¼��������� ����ϳ�
//		�б⼺���� ó������ ���󰡺��߸� �˱⿡ �����;��� �þ���� ������
//		MyLink arr=new MyLink();
		java.util.LinkedList arr = new java.util.LinkedList();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
