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
		System.out.println("(1)관리자\t(2)이용자\t(3)종료\t");
		System.out.print("이용할 모드의 번호를 입력하세요.: ");
		ch = Integer.parseInt(sc.nextLine());
		if(ch==3) {
			System.out.println("****************************** 종료합니다 ******************************");
		}
		
		if(ch==1) {
			System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
			System.out.print("원하시는 메뉴를 선택하세요. :");
			ch = Integer.parseInt(sc.nextLine());
			
//			if(ch==8) {
//				System.out.println("****************************** 종료합니다 ******************************");
//			}
			//************1번***********
			if(ch==1) {		//1번
				proInsert();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************2번***********		
			} if(ch==2) {	//2번
				proUpdate();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************3번***********		
			} if(ch==3) {	//3번
				proDelete();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************4번***********		
			} if(ch==4) {	// 4번
				selectProTitle();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
					
			//************5번***********		
			}if(ch==5) {	//5번
				selectAll();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				
			//************6번***********		
			}if(ch==6) {	// 6번
				applyAll();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
//				}if(ch==8) {
//					System.out.println("****************************** 종료합니다 ******************************");
//					
			//************7번***********		
			}if(ch==7) {	// 7번
				memList();
				System.out.println("*****************************************관리자모드입니다.*****************************************");	
				System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
				System.out.print("원하시는 메뉴를 선택하세요. :");
				ch = Integer.parseInt(sc.nextLine());
				}if(ch==1) {
					proInsert();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==2) {
					proUpdate();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==3) {
					proDelete();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==4) {
					selectProTitle();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==5) {
					selectAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==6) {
					applyAll();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}else if(ch==7) {
					memList();
					System.out.println("*****************************************관리자모드입니다.*****************************************");	
					System.out.print("(1)프로그램등록 (2)프로그램수정 (3)프로그램삭제 (4)프로그램검색 (5)프로그램목록 (6)신청조회 (7)회원목록 (8)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
				}if(ch==8) {
					System.out.println("****************************** 종료합니다 ******************************");
				}
				
		//************ 2번 이용자 ***********
		}if(ch==2){
			System.out.print("(1)회원가입 (2)로그인 (3)종료 \n");
			System.out.print("원하시는 메뉴를 선택하세요. :");
			ch = Integer.parseInt(sc.nextLine());
				if(ch==3) {
					System.out.println("****************************** 종료합니다 ******************************");
				}
		}
			//******* 1번 **********
				if(ch==1) {		//1번
					memJoin();
					System.out.println("************************************* 첫 화면으로 이동해주세요. ************************************");
				}
				// ************ 2번 ***********
				if(ch==2) {		//2번
					memLogin();
					System.out.println("*************************************이용자모드입니다.************************************");
					System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
					System.out.print("원하시는 메뉴를 선택하세요. :");
					ch = Integer.parseInt(sc.nextLine());
//					}if(ch==1) {
//						memLogin();
//						System.out.println("*************************************이용자모드입니다.************************************");
//						System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
//						System.out.print("원하시는 메뉴를 선택하세요. :");
//						ch = Integer.parseInt(sc.nextLine());
						if(ch==1) {
							selectAll();
							System.out.println("*************************************이용자모드입니다.************************************");
							System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
							System.out.print("원하시는 메뉴를 선택하세요. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}
							
				// ************ 2번-신청하기 ***********		
						if(ch==2) {
							memApply();
							System.out.println("*************************************이용자모드입니다.************************************");
							System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
							System.out.print("원하시는 메뉴를 선택하세요. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}
						// ************ 3번-마이페이지 ***********		
						if(ch==3) {
							memUpdate();
							System.out.println("*************************************이용자모드입니다.************************************");
							System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
							System.out.print("원하시는 메뉴를 선택하세요. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}
							
						// ************ 4번-탈퇴하기 ***********		
						if(ch==4) {
							memDelete();
							System.out.println("*************************************이용자모드입니다.************************************");
							System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
							System.out.print("원하시는 메뉴를 선택하세요. :");
							ch = Integer.parseInt(sc.nextLine());
							}if(ch==1) {
								selectAll();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==2) {
								memApply();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==3) {
								memUpdate();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}else if(ch==4) {
								memDelete();
								System.out.println("*************************************이용자모드입니다.************************************");
								System.out.print("(1)프로그램보기 (2)신청하기 (3)마이페이지 (4)탈퇴 (5)종료\n");
								System.out.print("원하시는 메뉴를 선택하세요. :");
								ch = Integer.parseInt(sc.nextLine());
							}if(ch==5) {
						System.out.println("****************************** 종료합니다 ******************************");
					}
				}
	}//main


	//프로그램 신청 전체 목록
	private static void applyAll() {
		ApplyDAO adao = new ApplyDAO();
		System.out.println("***********************프로그램 신청조회를 시작합니다.***********************");
		System.out.println();
		List<ApplyVO> list = new ArrayList<ApplyVO>();

		list = adao.applyAll();
		adao.display(list);
		System.out.println();
		System.out.println("***********************프로그램 신청조회 종료되었습니다.*********************************");
	}
	
	//프로그램신청하기-회원
	private static void memApply() {
		ApplyDAO adao = new ApplyDAO();
		System.out.println("******************프로그램신청을 시작하겠습니다.******************");
		System.out.print("회원번호를 입력하세요.:");
		int mem_no = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.print("프로그램번호를 입력하세요.:");
		int pro_no = Integer.parseInt(sc.nextLine());
		System.out.println();

		ApplyVO apply = new ApplyVO(0, mem_no, pro_no);
		int result = adao.applyInsert(apply);

		if (result > 0){
			System.out.println();
			System.out.println("*************************프로그램 신청 완료되었습니다.*************************");
			System.out.println("회원번호는 " + mem_no +"번 입니다.");
			System.out.println("프로그램번호는 " + pro_no+"번을 신청하셨습니다.");
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_no + "프로그램 신청 실패하였습니다.");
		}
	}



	//회원로그인
	private static void memLogin() {
		MemberVO vo = new MemberVO();
		//		System.out.println("********로그인*******");
		//		
		//		System.out.print("아이디를 입력하세요.:");
		//		String mem_id = sc.nextLine();
		//		System.out.print("비밀번호를 입력하세요.:");
		//		String mem_pw = sc.nextLine();
		//		
		//		if(mem_id.equals("admin") && mem_pw.equals("0000")) {
		//			System.out.println("관리자 로그인성공!");
		//		}else {
		//			System.out.println("로그인실패!");
		//		}

		//		if(mem_id.equals("jiji") && mem_pw.equals("1111")) {
		//			System.out.println("로그인성공!");
		//		}else {
		//			System.out.println("로그인실패!");
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
		System.out.println("******************로그인을 시작합니다.******************");
		System.out.print("아이디를 입력하세요.:");
		String mem_id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요.:");
		String mem_pw = sc.nextLine();

		MemberVO member = new MemberVO(mem_id, mem_pw, null, null);
		int result = mdao.login(mem_id, mem_pw);


		if (result > 0){
			System.out.println();
			System.out.println("*************************로그인 되었습니다.*************************");
			System.out.println("아이디:" + mem_id);
			System.out.println("비번:" + mem_pw);
			System.out.println(mem_id+"님 로그인 되셨습니다.");
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_id + "로그인에 실패하였습니다.");
		}
	}

	//회원탈퇴 
	private static void memDelete() {
		System.out.println("******************회원 정보 탈퇴를 시작합니다.******************");
		System.out.print("탈퇴할 ID를 입력하세요.: ");
		String mem_id = sc.nextLine();
		ResultSet rs = mdao.checkId(mem_id);
		System.out.print("비밀번호를 입력하세요.: ");
		String mem_pw = sc.nextLine();
		System.out.print("정말 탈퇴하시겠습니까?(Y/N): ");
		char scsn = sc.nextLine().toUpperCase().charAt(0);
		
		if(scsn == 'Y'){
			try {
				
				MemberVO vo = new MemberVO();
				vo.setMem_id(mem_id);
				vo.setMem_pw(mem_pw);
				
				int result = mdao.memDelete(vo);
				
				if(result > 0) {
					System.out.println("******************회원 탈퇴 완료되었습니다.******************");
				}else {
					System.out.println(mem_id + "님 회원 탈퇴 실패하였습니다.");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}else {
			System.out.println("탈퇴가 취소되었습니다.!");
		}
	}

	//회원정보수정
	private static void memUpdate() {
		System.out.println("******************회원 정보 수정을 시작합니다.******************");
		System.out.print("ID를 입력하세요.: ");
		String mem_id = sc.nextLine();
		ResultSet rs = mdao.checkId(mem_id);

		try {
			if(rs.next() != true) {
				System.out.println(mem_id + " 아이디는 등록되어 있지 않습니다.");
			}else {
				System.out.println(mem_id+"님의 회원정보 수정페이지 입니다.");
				System.out.println();
				System.out.print("비밀번호를 수정하세요.: ");
				String mem_pw = sc.nextLine();
				System.out.print("이름을 수정하세요.: ");
				String mem_name = sc.nextLine();
				System.out.print("전화번호를 수정하세요(ex.010-0000-0000): ");
				String mem_phone = sc.nextLine();

				MemberVO vo = new MemberVO(0, mem_id, mem_pw, mem_name, mem_phone);
				int result = mdao.memUpdate(vo);
				if (result > 0){
					System.out.println(mem_id + "님의 회원 정보가 수정되었습니다.");
					System.out.println();
					System.out.println("******************회원정보 수정 완료되었습니다.******************");
					System.out.println("아이디:" + mem_id);
					System.out.println("비밀번호:" + mem_pw);
					System.out.println("이름:" + mem_name);
					System.out.println("전화번호:" + mem_phone);
					System.out.println("*******************************************************");
				}else {
					System.out.println(mem_id + "님의 회원 정보가 수정 실패하였습니다.");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//회원가입 
	private static void memJoin() {
		System.out.println("******************회원가입을 시작하겠습니다.******************");
		System.out.print("ID를 입력하세요.:");
		String mem_id = sc.nextLine();
		System.out.println();
		System.out.print("비밀번호를 입력하세요.:");
		String mem_pw = sc.nextLine();
		System.out.println();
		System.out.print("이름을 입력하세요.:");
		String mem_name = sc.nextLine();
		System.out.println();
		System.out.print("전화번호를 입력하세요(ex.010-0000-0000):");
		String mem_phone = sc.nextLine();

		MemberVO member = new MemberVO(mem_id, mem_pw, mem_name, mem_phone);
		int result = mdao.memJoin(member);

		if (result > 0){
			System.out.println();
			System.out.println("*************************회원가입 완료되었습니다.*************************");
			System.out.println("아이디:" + mem_id);
			System.out.println("비번:" + mem_pw);
			System.out.println("이름:" + mem_name);
			System.out.println("전화번호:" + mem_phone);
			System.out.println("****************************************************************");
		}else {
			System.out.println(mem_id + "회원가입 실패하였습니다.");
		}
	}



	//전체 회원목록
	private static void memList() {
		System.out.println("***********************회원 전체 조회를 시작합니다.***********************");
		System.out.println();
		List<MemberVO> list = new ArrayList<MemberVO>();

		MemberDAO dao = new MemberDAO();
		list = dao.memList();
		dao.memdisplay(list);
		System.out.println();
		System.out.println("*********************************************************************");
	}








	// ************** PROGRAM **************

	//프로그램 제목 검색 조회 
	private static void selectProTitle() {
		System.out.println("***********************프로그램 검색을 시작합니다.***********************");
		System.out.print("검색할 프로그램의 이름을 입력하세요.: ");
		String searchTitle = sc.nextLine();
		ArrayList<ProgramVO> list = new ArrayList<ProgramVO>();
		System.out.println();
		ProgramDAO dao = new ProgramDAO();
		dao.selectProTitle(list, searchTitle);
		dao.display(list);
		System.out.println();
		System.out.println("***********************프로그램 검색이 완료되었습니다.*************************");
	}

	//프로그램 삭제
	private static void proDelete() {
		System.out.println("******************프로그램 정보 삭제를 시작합니다.******************");
		System.out.print("삭제할 번호를 입력하세요.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);
		System.out.print("정말 삭제하겠습니까?(Y/N): ");
		char scsn = sc.nextLine().toUpperCase().charAt(0);
		
		if(scsn == 'Y'){
			try {
				
				ProgramVO vo = new ProgramVO();
				vo.setPro_no(Pro_no);
				
				int result = dao.proDelete(Pro_no);
				
				if(result > 0) {
					System.out.println("******************프로그램 삭제 완료되었습니다.******************");
				}else {
					System.out.println(Pro_no + "번 프로그램 정보가 삭제 실패하였습니다.");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}else {
			System.out.println("삭제가 취소되었습니다.!");
		}
	}
	
	

	//프로그램 수정
	private static void proUpdate() {
		System.out.println("******************프로그램 정보 수정을 시작합니다.******************");
		System.out.print("수정할 번호를 입력하세요.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);

		try {
			if(rs.next() != true) {
				System.out.println(Pro_no + "번 프로그램은 등록되어 있지 않습니다.");
				//System.out.println("다른 번호를 입력해주세요.");
			}else {
				//System.out.println("생성가능한 번호입니다.");
				//System.out.println();
				//System.out.print("수정할 번호를 한번 더 입력하세요.: ");
				//int Pro_no = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 프로그램명을 입력하세요.: ");
				String Pro_title = sc.nextLine();
				System.out.print("수정할 강사 이름을 입력하세요.: ");
				String Pro_teacher = sc.nextLine();
				System.out.print("수정할 수강 금액을 입력하세요.: ");
				int Pro_price = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 시작 날짜를 입력하세요.: ");
				Date Pro_startday = Date.valueOf(sc.nextLine());
				System.out.print("수정할 종료 날짜를 입력하세요.: ");
				Date Pro_endday = Date.valueOf(sc.nextLine());

				ProgramVO vo = new ProgramVO(Pro_no, Pro_title, Pro_teacher, Pro_price, Pro_startday, Pro_endday);
				int succ = dao.proUpdate(vo);
				if (succ > 0){
					System.out.println(Pro_no + "번 프로그램 정보가 수정되었습니다.");
					System.out.println();
					System.out.println("프로그램명:" + Pro_title);
					System.out.println("강사 이름:" + Pro_teacher);
					System.out.println("수강 금액:" + Pro_price);
					System.out.println("시작 날짜:" + Pro_startday);
					System.out.println("종료 날짜:" + Pro_endday);
					System.out.println("******************프로그램 수정 완료되었습니다.******************");
				}else {
					System.out.println(Pro_no + "번 프로그램 정보가 수정 실패하였습니다.");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//프로그램 등록
	private static void proInsert() {
		System.out.println("******************프로그램 등록을 시작합니다.******************");
		System.out.print("등록할 번호를 입력하세요.: ");
		int Pro_no = Integer.parseInt(sc.nextLine());
		ProgramDAO dao = new ProgramDAO();
		ResultSet rs = dao.checkNum(Pro_no);

		try {
			if(rs.next() == true) {
				System.out.println(Pro_no + "번 프로그램은 이미 등록되어 있습니다.");
				System.out.println("다른 번호를 입력해주세요.");
			}else {
				//				System.out.println("생성가능한 번호입니다.");
				//				System.out.println();
				//				System.out.print("번호를 한번 더 입력하세요.: ");
				//				int Pro_no = Integer.parseInt(sc.nextLine());
				System.out.print("프로그램명을 입력하세요.: ");
				String Pro_title = sc.nextLine();
				System.out.print("강사 이름을 입력하세요.: ");
				String Pro_teacher = sc.nextLine();
				System.out.print("수강 금액을 입력하세요.: ");
				int Pro_price = Integer.parseInt(sc.nextLine());
				System.out.print("시작 날짜를 입력하세요.: ");
				Date Pro_startday = Date.valueOf(sc.nextLine());
				System.out.print("종료 날짜를 입력하세요.: ");
				Date Pro_endday = Date.valueOf(sc.nextLine());

				ProgramVO vo = new ProgramVO(Pro_no, Pro_title, Pro_teacher, Pro_price, Pro_startday, Pro_endday);
				int succ = dao.proInsert(vo);
				if (succ > 0){
					System.out.println(Pro_no + "번 프로그램이 등록되었습니다.");
					System.out.println();
					System.out.println("******************프로그램 등록 완료하였습니다.******************");
					System.out.println("프로그램명:" + Pro_title);
					System.out.println("강사 이름:" + Pro_teacher);
					System.out.println("수강 금액:" + Pro_price);
					System.out.println("시작 날짜:" + Pro_startday);
					System.out.println("종료 날짜:" + Pro_endday);
					System.out.println("******************************************************");
				}else {
					System.out.println(Pro_no + "번 프로그램이 등록 실패하였습니다.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//전체 클래스목록
	private static void selectAll() {
		System.out.println("***********************프로그램 전체 조회를 시작합니다.***********************");
		System.out.println();
		List<ProgramVO> list = new ArrayList<ProgramVO>();

		list = dao.selectAll();
		dao.display(list);
		System.out.println();
		System.out.println("***********************프로그램 전체조회를 종료합니다.*********************************");
	}

}
