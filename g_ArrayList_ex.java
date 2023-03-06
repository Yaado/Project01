import java.util.ArrayList;

public class ArrayList_ex {
	public static void main(String args[]) {
		
		ArrayList<String> listvar = new ArrayList<String>();
		
		//리스트 요소 추가
		listvar.add("01");
		listvar.add("02");
		listvar.add("03");
		listvar.add("04");
		System.out.println("listvar="+listvar);
		
		//중간에 요소 추가
		listvar.add(1,"01-1");
		System.out.println("인덱스값 추가 listvar="+listvar);
		
		//해당 인덱스 반환
		System.out.println("listvar.get(0)="+listvar.get(0));
		System.out.println("listvar.get(2)="+listvar.get(2));
		
		//인덱스로 값 변경
		listvar.set(2, "02-change");
		System.out.println("인덱스값 변경 listvar="+listvar);

		//값 삭제
		listvar.remove(1);
		System.out.println("값 삭제 listvar="+listvar);
		
		//값 포함하는지
		System.out.println(listvar.contains("02-change"));
		
		//배열 비우기
		//listvar.clear();
		
		//배열 비었는지 확인
		System.out.println(listvar.isEmpty());
		
		//두 리스트 합치기
		
		ArrayList<String> listvar_2 = new ArrayList<String>();
		listvar_2.add("2_01");
		listvar_2.add("2_02");
		listvar_2.add("2_03");
		listvar_2.add("2_04");
		
		listvar.addAll(listvar_2);
		System.out.println(listvar);
		
		//한 리스트가 다른 리스트에 포함되는지 확인
		System.out.println(listvar.containsAll(listvar_2));
		
		//리스트 해당 요소 빼고 지우기
		//listvar.retainAll(listvar_2);
		
		//리스트 해당 요소 지우기
		//listvar.removeAll(listvar_2);
		
		//리스트 요소 개수 반환
		System.out.println(listvar.size());
		System.out.println(listvar_2.size());
		
		
	}
}
