package Program;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Apply.ApplyDAO;
import Apply.ApplyVO;
import Member.MemberDAO;
import Member.MemberVO;

public class ProgramMain {

	static Scanner sc = new Scanner(System.in);
	static MemberDAO mdao = new MemberDAO();
	static ProgramDAO dao = new ProgramDAO();
	public static void main(String[] args) {
		int ch;
		System.out.println("(1)������\t(2)�̿���\t(3)����\t");
		System.out.print("�̿��� ����� ��ȣ�� �Է��ϼ���.: ");
		ch = Integer.parseInt(sc.nextLine());
		if(ch==3) {
			System.out.println("****************************** �����մϴ� ******************************");
		}
		
		if(ch==1) {
			System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
			System.out.print("���Ͻô� �޴��� �����ϼ���. :");
			ch = Integer.parseInt(sc.nextLine());
			
//			if(ch==8) {
//				System.out.println("****************************** �����մϴ� ******************************");
//			}
			//************1��***********
			if(ch==1) {		//1��
				proInsert();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************2��***********		
			} if(ch==2) {	//2��
				proUpdate();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************3��***********		
			} if(ch==3) {	//3��
				proDelete();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************4��***********		
			} if(ch==4) {	// 4��
				selectProTitle();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************5��***********		
			}if(ch==5) {	//5��
				selectAll();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				
			//************6��***********		
			}if(ch==6) {	// 6��
				applyAll();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
//				}if(ch==8) {
//					System.out.println("****************************** �����մϴ� ******************************");
//					
			//************7��***********		
			}if(ch==7) {	// 7��
				memList();
				System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
				System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
				System.out.print("���Ͻô� �޴��� �����ϼ���. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************�����ڸ���Դϴ�.*****************************************");	
					System.out.print("(1)���α׷���� (2)���α׷����� (3)���α׷����� (4)���α׷��˻� (5)���α׷���� (6)��û��ȸ (7)ȸ����� (8)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
				}if(ch==8) {
					System.out.println("****************************** �����մϴ� ******************************");
				}
				
		//************ 2�� �̿��� ***********
		}if(ch==2){
			System.out.print("(1)ȸ������ (2)�α��� (3)���� \n");
			System.out.print("���Ͻô� �޴��� �����ϼ���. :");
			ch = Integer.parseInt(sc.nextLine());
				if(ch==3) {
					System.out.println("****************************** �����մϴ� ******************************");
				}
		}
			//******* 1�� **********
				if(ch==1) {		//1��
					memJoin();
					System.out.println("************************************* ù ȭ������ �̵����ּ���. ************************************");
				}
				// ************ 2�� ***********
				if(ch==2) {		//2��
					memLogin();
					System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
					System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
					System.out.print("���Ͻô� �޴��� �����ϼ���. :");
					ch = Integer.parseInt(sc.nextLine());
//					}if(ch==1) {
//						memLogin();
//						System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
//						System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
//						System.out.print("���Ͻô� �޴��� �����ϼ���. :");
//						ch = Integer.parseInt(sc.nextLine());
						if(ch==1) {
							selectAll();
							System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
							System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
							System.out.print("���Ͻô� �޴��� �����ϼ���. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}
							
				// ************ 2��-��û�ϱ� ***********		
						if(ch==2) {
							memApply();
							System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
							System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
							System.out.print("���Ͻô� �޴��� �����ϼ���. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}
						// ************ 3��-���������� ***********		
						if(ch==3) {
							memUpdate();
							System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
							System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
							System.out.print("���Ͻô� �޴��� �����ϼ���. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}
							
						// ************ 4��-Ż���ϱ� ***********		
						if(ch==4) {
							memDelete();
							System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
							System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
							System.out.print("���Ͻô� �޴��� �����ϼ���. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************�̿��ڸ���Դϴ�.************************************");
								System.out.print("(1)���α׷����� (2)��û�ϱ� (3)���������� (4)Ż�� (5)����\n");
								System.out.print("���Ͻô� �޴��� �����ϼ���. :");
								ch = Integer.parseInt(sc.nextLine());
							}if(ch==5) {
						System.out.println("****************************** �����մϴ� ******************************");
					}
				}
	}//main


	//���α׷� ��û ��ü ���
	private static void applyAll() {
		ApplyDAO adao = new ApplyDAO();
		System.out.println("***********************���α׷� ��û��ȸ�� �����մϴ�.***********************");
		System.out.println();
		List<ApplyVO> list = new ArrayList<ApplyVO>();

		list = adao.applyAll();
		adao.display(list);
		System.out.println();
		System.out.println("***********************���α׷� ��û��ȸ ����Ǿ����ϴ�.*********************************");
	}
	
	//���α׷���û�ϱ�-ȸ��
	private static void memApply() {
		ApplyDAO adao = new ApplyDAO();
		System.out.println("******************���α׷���û�� �����ϰڽ��ϴ�.******************");
		System.out.print("ȸ����ȣ�� �Է��ϼ���.:");
		int mem_no = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.print("���α׷���ȣ�� �Է��ϼ���.:");
		int pro_no = Integer.parseInt(sc.nextLine());
		System.out.println();

		ApplyVO apply = new ApplyVO(0, mem_no, pro_no);
		int result = adao.applyInsert(apply);

		if (result > 0){
			System.out.println();
			System.out.println("*************************���α׷� ��û �Ϸ�Ǿ����ϴ�.*************************");
			System.out.println("ȸ����ȣ�� " + mem_no +"�� �Դϴ�.");
			System.out.println("���α׷���ȣ�� " + pro_no+"���� ��û�ϼ̽��ϴ�.");
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_no + "���α׷� ��û �����Ͽ����ϴ�.");
		}
	}



	//ȸ���α���
	private static void memLogin() {
		MemberVO vo = new MemberVO();
		//		System.out.println("********�α���*******");
		//		
		//		System.out.print("���̵� �Է��ϼ���.:");
		//		String mem_id = sc.nextLine();
		//		System.out.print("��й�ȣ�� �Է��ϼ���.:");
		//		String mem_pw = sc.nextLine();
		//		
		//		if(mem_id.equals("admin") && mem_pw.equals("0000")) {
		//			System.out.println("������ �α��μ���!");
		//		}else {
		//			System.out.println("�α��ν���!");
		//		}

		//		if(mem_id.equals("jiji") && mem_pw.equals("1111")) {
		//			System.out.println("�α��μ���!");
		//		}else {
		//			System.out.println("�α��ν���!");
		//		}

		//		int result = mdao.login(vo.getMem_id(), vo.getMem_pw());
		//	}

		//		if(vo!=null) {
		//			if(vo.getMem_id().equals(mem_pw)) {
		//				MemberVO = vo;
		//				return;
		//			}
		//		}

		//	}
		System.out.println("******************�α����� �����մϴ�.******************");
		System.out.print("���̵� �Է��ϼ���.:");
		String mem_id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ���.:");
		String mem_pw = sc.nextLine();

		MemberVO member = new MemberVO(mem_id, mem_pw, null, null);
		int result = mdao.login(mem_id, mem_pw);


		if (result > 0){
			System.out.println();
			System.out.println("*************************�α��� �Ǿ����ϴ�.*************************");
			System.out.println("���̵�:" + mem_id);
			System.out.println("���:" + mem_pw);
			System.out.println(mem_id+"�� �α��� �Ǽ̽��ϴ�.");
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_id + "�α��ο� �����Ͽ����ϴ�.");
		}
	}

	//ȸ��Ż�� 
	private static void memDelete() {
		System.out.println("******************ȸ�� ���� Ż�� �����մϴ�.******************");
		System.out.print("Ż���� ID�� �Է��ϼ���.: ");
		String mem_id = sc.nextLine();
		ResultSet rs = mdao.checkId(mem_id);
		System.out.print("��й�ȣ�� �Է��ϼ���.: ");
		String mem_pw = sc.nextLine();
		System.out.print("���� Ż���Ͻðڽ��ϱ�?(Y/N): ");
		char scsn = sc.nextLine().toUpperCase().charAt(0);
		
		if(scsn == 'Y'){
			try {
				
				MemberVO vo = new MemberVO();
				vo.setMem_id(mem_id);
				vo.setMem_pw(mem_pw);
				
				int result = mdao.memDelete(vo);
				
				if(result > 0) {
					System.out.println("******************ȸ�� Ż�� �Ϸ�Ǿ����ϴ�.******************");
				}else {
					System.out.println(mem_id + "�� ȸ�� Ż�� �����Ͽ����ϴ�.");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}else {
			System.out.println("Ż�� ��ҵǾ����ϴ�.!");
		}
	}

	//ȸ����������
	private static void memUpdate() {
		System.out.println("******************ȸ�� ���� ������ �����մϴ�.******************");
		System.out.print("ID�� �Է��ϼ���.: ");
		String mem_id = sc.nextLine();
		ResultSet rs = mdao.checkId(mem_id);

		try {
			if(rs.next() != true) {
				System.out.println(mem_id + " ���̵�� ��ϵǾ� ���� �ʽ��ϴ�.");
			}else {
				System.out.println(mem_id+"���� ȸ������ ���������� �Դϴ�.");
				System.out.println();
				System.out.print("��й�ȣ�� �����ϼ���.: ");
				String mem_pw = sc.nextLine();
				System.out.print("�̸��� �����ϼ���.: ");
				String mem_name = sc.nextLine();
				System.out.print("��ȭ��ȣ�� �����ϼ���(ex.010-0000-0000): ");
				String mem_phone = sc.nextLine();

				MemberVO vo = new MemberVO(0, mem_id, mem_pw, mem_name, mem_phone);
				int result = mdao.memUpdate(vo);
				if (result > 0){
					System.out.println(mem_id + "���� ȸ�� ������ �����Ǿ����ϴ�.");
					System.out.println();
					System.out.println("******************ȸ������ ���� �Ϸ�Ǿ����ϴ�.******************");
					System.out.println("���̵�:" + mem_id);
					System.out.println("��й�ȣ:" + mem_pw);
					System.out.println("�̸�:" + mem_name);
					System.out.println("��ȭ��ȣ:" + mem_phone);
					System.out.println("*******************************************************");
				}else {
					System.out.println(mem_id + "���� ȸ�� ������ ���� �����Ͽ����ϴ�.");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//ȸ������ 
	private static void memJoin() {
		System.out.println("******************ȸ�������� �����ϰڽ��ϴ�.******************");
		System.out.print("ID�� �Է��ϼ���.:");
		String mem_id = sc.nextLine();
		System.out.println();
		System.out.print("��й�ȣ�� �Է��ϼ���.:");
		String mem_pw = sc.nextLine();
		System.out.println();
		System.out.print("�̸��� �Է��ϼ���.:");
		String mem_name = sc.nextLine();
		System.out.println();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���(ex.010-0000-0000):");
		String mem_phone = sc.nextLine();

		MemberVO member = new MemberVO(mem_id, mem_pw, mem_name, mem_phone);
		int result = mdao.memJoin(member);

		if (result > 0){
			System.out.println();
			System.out.println("*************************ȸ������ �Ϸ�Ǿ����ϴ�.*************************");
			System.out.println("���̵�:" + mem_id);
			System.out.println("���:" + mem_pw);
			System.out.println("�̸�:" + mem_name);
			System.out.println("��ȭ��ȣ:" + mem_phone);
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_id + "ȸ������ �����Ͽ����ϴ�.");
		}
	}



	//��ü ȸ�����
	private static void memList() {
		System.out.println("***********************ȸ�� ��ü ��ȸ�� �����մϴ�.***********************");
		System.out.println();
		List<MemberVO> list = new ArrayList<MemberVO>();

		MemberDAO dao = new MemberDAO();
		list = dao.memList();
		dao.memdisplay(list);
		System.out.println();
		System.out.println("*********************************************************************");
	}








	// ************** PROGRAM **************

	//���α׷� ���� �˻� ��ȸ 
	private static void selectProTitle() {
		System.out.println("***********************���α׷� �˻��� �����մϴ�.***********************");
		System.out.print("�˻��� ���α׷��� �̸��� �Է��ϼ���.: ");
		String searchTitle = sc.nextLine();
		ArrayList<ProgramVO> list = new ArrayList<ProgramVO>();
		System.out.println();
		ProgramDAO dao = new ProgramDAO();
		dao.selectProTitle(list, searchTitle);
		dao.display(list);
		System.out.println();
		System.out.println("***********************���α׷� �˻��� �Ϸ�Ǿ����ϴ�.*************************");
	}

	//���α׷� ����
	private static void proDelete() {
		System.out.println("******************���α׷� ���� ������ �����մϴ�.******************");
		System.out.print("������ ��ȣ�� �Է��ϼ���.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);
		System.out.print("���� �����ϰڽ��ϱ�?(Y/N): ");
		char scsn = sc.nextLine().toUpperCase().charAt(0);
		
		if(scsn == 'Y'){
			try {
				
				ProgramVO vo = new ProgramVO();
				vo.setPro_no(Pro_no);
				
				int result = dao.proDelete(Pro_no);
				
				if(result > 0) {
					System.out.println("******************���α׷� ���� �Ϸ�Ǿ����ϴ�.******************");
				}else {
					System.out.println(Pro_no + "�� ���α׷� ������ ���� �����Ͽ����ϴ�.");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}else {
			System.out.println("������ ��ҵǾ����ϴ�.!");
		}
	}
	
	

	//���α׷� ����
	private static void proUpdate() {
		System.out.println("******************���α׷� ���� ������ �����մϴ�.******************");
		System.out.print("������ ��ȣ�� �Է��ϼ���.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);

		try {
			if(rs.next() != true) {
				System.out.println(Pro_no + "�� ���α׷��� ��ϵǾ� ���� �ʽ��ϴ�.");
				//System.out.println("�ٸ� ��ȣ�� �Է����ּ���.");
			}else {
				//System.out.println("���������� ��ȣ�Դϴ�.");
				//System.out.println();
				//System.out.print("������ ��ȣ�� �ѹ� �� �Է��ϼ���.: ");
				//int Pro_no = Integer.parseInt(sc.nextLine());
				System.out.print("������ ���α׷����� �Է��ϼ���.: ");
				String Pro_title = sc.nextLine();
				System.out.print("������ ���� �̸��� �Է��ϼ���.: ");
				String Pro_teacher = sc.nextLine();
				System.out.print("������ ���� �ݾ��� �Է��ϼ���.: ");
				int Pro_price = Integer.parseInt(sc.nextLine());
				System.out.print("������ ���� ��¥�� �Է��ϼ���.: ");
				Date Pro_startday = Date.valueOf(sc.nextLine());
				System.out.print("������ ���� ��¥�� �Է��ϼ���.: ");
				Date Pro_endday = Date.valueOf(sc.nextLine());

				ProgramVO vo = new ProgramVO(Pro_no, Pro_title, Pro_teacher, Pro_price, Pro_startday, Pro_endday);
				int succ = dao.proUpdate(vo);
				if (succ > 0){
					System.out.println(Pro_no + "�� ���α׷� ������ �����Ǿ����ϴ�.");
					System.out.println();
					System.out.println("���α׷���:" + Pro_title);
					System.out.println("���� �̸�:" + Pro_teacher);
					System.out.println("���� �ݾ�:" + Pro_price);
					System.out.println("���� ��¥:" + Pro_startday);
					System.out.println("���� ��¥:" + Pro_endday);
					System.out.println("******************���α׷� ���� �Ϸ�Ǿ����ϴ�.******************");
				}else {
					System.out.println(Pro_no + "�� ���α׷� ������ ���� �����Ͽ����ϴ�.");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//���α׷� ���
	private static void proInsert() {
		System.out.println("******************���α׷� ����� �����մϴ�.******************");
		System.out.print("����� ��ȣ�� �Է��ϼ���.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);

		try {
			if(rs.next() == true) {
				System.out.println(Pro_no + "�� ���α׷��� �̹� ��ϵǾ� �ֽ��ϴ�.");
				System.out.println("�ٸ� ��ȣ�� �Է����ּ���.");
			}else {
				//				System.out.println("���������� ��ȣ�Դϴ�.");
				//				System.out.println();
				//				System.out.print("��ȣ�� �ѹ� �� �Է��ϼ���.: ");
				//				int Pro_no = Integer.parseInt(sc.nextLine());
				System.out.print("���α׷����� �Է��ϼ���.: ");
				String Pro_title = sc.nextLine();
				System.out.print("���� �̸��� �Է��ϼ���.: ");
				String Pro_teacher = sc.nextLine();
				System.out.print("���� �ݾ��� �Է��ϼ���.: ");
				int Pro_price = Integer.parseInt(sc.nextLine());
				System.out.print("���� ��¥�� �Է��ϼ���.: ");
				Date Pro_startday = Date.valueOf(sc.nextLine());
				System.out.print("���� ��¥�� �Է��ϼ���.: ");
				Date Pro_endday = Date.valueOf(sc.nextLine());

				ProgramVO vo = new ProgramVO(Pro_no, Pro_title, Pro_teacher, Pro_price, Pro_startday, Pro_endday);
				int succ = dao.proInsert(vo);
				if (succ > 0){
					System.out.println(Pro_no + "�� ���α׷��� ��ϵǾ����ϴ�.");
					System.out.println();
					System.out.println("******************���α׷� ��� �Ϸ��Ͽ����ϴ�.******************");
					System.out.println("���α׷���:" + Pro_title);
					System.out.println("���� �̸�:" + Pro_teacher);
					System.out.println("���� �ݾ�:" + Pro_price);
					System.out.println("���� ��¥:" + Pro_startday);
					System.out.println("���� ��¥:" + Pro_endday);
					System.out.println("******************************************************");
				}else {
					System.out.println(Pro_no + "�� ���α׷��� ��� �����Ͽ����ϴ�.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//��ü Ŭ�������
	private static void selectAll() {
		System.out.println("***********************���α׷� ��ü ��ȸ�� �����մϴ�.***********************");
		System.out.println();
		List<ProgramVO> list = new ArrayList<ProgramVO>();

		list = dao.selectAll();
		dao.display(list);
		System.out.println();
		System.out.println("***********************���α׷� ��ü��ȸ�� �����մϴ�.*********************************");
	}

}
