package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class pr_pccp02 {
  public static void main(String[] args) {
    int[][] land = new int[][]{
        {1, 0, 1, 0, 1, 1},
        {1, 0, 1, 0, 0, 0},
        {1, 0, 1, 0, 0, 1},
        {1, 0, 0, 1, 0, 0},
        {1, 0, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1}
    };
    for(int i = 0; i <land[0].length; i++) {
      resultList.add(oneRowCheck(land,i));
    }
    System.out.println(resultList);
    System.out.println(Collections.max(resultList));


  }
  // 이미 지나간 자리
  static ArrayList flag = new ArrayList<Pair>();
  // 각 열에 대한 결과값 리스트
  static ArrayList resultList = new ArrayList<Integer>();

  static int result ;


  // 한 열의 전체를 확인한다.
  static int oneRowCheck(int [][] land, int order){
    result = 0;
    for(int oneRowY =0; oneRowY<land.length; oneRowY++){
      fourWayConnect(land,order,oneRowY);
    }
    flag.clear();
    return result;
  }

  static void fourWayConnect(int[][] land, int x, int y){
    Pair pair = new Pair(x,y);
    if(x < 0 || x >land[0].length -1 || y < 0 || y >land.length -1) return ;
    if(land[y][x] == 1 && !(flag.contains(pair))) {
      flag.add(pair);
      result++;
    }
    else{
      flag.add(pair);
      return;
    }
    fourWayConnect(land,x+1,y);
    fourWayConnect(land,x-1,y);
    fourWayConnect(land,x,y+1);
    fourWayConnect(land,x,y-1);
  }

  public static class Pair{
    int x;
    int y;

    Pair(int x, int y){
      this.x = x;
      this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
      // 자기 자신과 비교
      if (this == obj) return true;
      // 객체가 null이거나 클래스가 다르면 false
      if (obj == null || getClass() != obj.getClass()) return false;
      // 필드 값 비교
      Pair pair = (Pair) obj;
      return x == pair.x && y == pair.y;
    }

  }

}
