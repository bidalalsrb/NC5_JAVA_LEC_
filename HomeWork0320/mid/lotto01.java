//package HomeWork0320.mid;
//
//import java.util.Scanner;
//
//public class lotto01 extends Game  {
//    public static void main(String[] args) {
//
//        //1~45까지 7개의 난수(중복제거)
//        //7번째 숫자는 보너스 번호
//
//        //사용자가 1~45까지 6개 숫자 선택(중복제거)
//
//        //1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을 때
//        //2등 : 보너스 변호와 5개 번호가 일치할 때
//        //3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
//        //4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 때
//        //5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
//        //나머지는 꽝
//
//        //몇 등인지 출력
//
//        int[] lottoNum = new int[6];
//        int bonusNum;
//
//        int[] userNum = new int[6];
//        int rank = 0;
//        Scanner sc = new Scanner(System.in);
//
//        public void start () {
//
//
//            while (true) {
//
//                //로또 번호 생성
//                randomNum();
//                randomBonus();
//                //7개의 로또 번호 난수
//                System.out.println("로또 번호 : " + lottoNum[0] + " " + lottoNum[1] + " " + lottoNum[2] + " " + lottoNum[3] + " "
//                        + lottoNum[4] + " " + lottoNum[5] + " " + "보너스번호 : " + bonusNum);
//
//                //사용자가 입력한 번호
//                userPick();
//                System.out.println("사용자 번호 : " + userNum[0] + " " + userNum[1] + " " + userNum[2] + " " + userNum[3]
//                        + " " + userNum[4] + " " + userNum[5]);
//
//                rankCheck();
//                System.out.println(rank + "등입니다.");
//                if (rank == 100) {
//                    System.out.println("꽝");
//                }
//                if (reGame()) {
//                    continue;
//                } else {
//                    break;
//                }
//
//            }
//
//
//        }
//
//        //6개의 로또 번호 생성
//        public void randomNum () {
//            for (int i = 0; i < lottoNum.length; i++) {
//                lottoNum[i] = (int) (Math.random() * 45 + 1);
//
//                if (i > 0) {
//                    if (checkDuplicate(lottoNum, i)) {
//                        i--;
//                        continue;
//                    }
//                }
//            }
//        }
//
//        // 중복값 체크 메소드
//        public boolean checkDuplicate ( int[] arr, int num){
//            boolean isDuplicated = false;
//
//            for (int i = 0; i < num; i++) {
//                if (arr[i] == arr[num]) {
//                    isDuplicated = true;
//                }
//            }
//
//            return isDuplicated;
//        }
//
//
//        //보너스 번호 생성
//        public int randomBonus () {
//
//            while (true) {
//
//                bonusNum = (int) (Math.random() * 45 + 1);
//                boolean flag = false;
//                for (int i = 0; i < lottoNum.length; i++) {
//                    if (lottoNum[i] == bonusNum) {
//                        flag = true;
//                    }
//                }
//                if (flag) {
//                    continue;
//                } else {
//                    break;
//                }
//            }
//
//            return bonusNum;
//        }
//
//        // 사용자 입력한 6개의 숫자
//
//        public void userPick () {
//
//            System.out.println("1부터 45사이의 숫자를 입력해주세요 : ");
//
//            for (int i = 0; i < userNum.length; i++) {
//                int pickNum = sc.nextInt();
//                userNum[i] = pickNum;
//                if (pickNum < 1 || pickNum > 45) {
//                    System.out.println("다시 입력해주세요.");
//                    i--;
//                    continue;
//                }
//                if (checkDuplicate(userNum, i)) {
//                    i--;
//                    continue;
//                }
//            }
//        }
//
//        //등수를 판별해주는 메소드
//        public int rankCheck () {
//            int count = 0;
//            int count2 = 0;
//            for (int i = 0; i < lottoNum.length; i++) {
//                for (int j = 0; j < userNum.length; j++) {
//                    //보너스 미포함
//                    if (lottoNum[i] == userNum[j]) {
//                        count++;
//                    } else if (userNum[j] == bonusNum) {
//                        count2++;
//                    }
//                }
//                if (count == 6) {
//                    return rank = 1;
//                } else if (count > 4 && count2 == 1) {
//                    return rank = 2;
//                } else if (count == 5) {
//                    return rank = 3;
//                } else if (count == 4) {
//                    return rank = 4;
//                } else if (count == 3) {
//                    return rank = 5;
//                } else {
//                    return rank = 100;
//                }
//            }
//
//            return rank;
//
//
//        }
//
//        // 재게임 여부
//        public boolean reGame () {
//            boolean isRegame = false;
//
//            while (true) {
//                System.out.println("1: 리스타트, 0: 종료");
//                int userInput = sc.nextInt();
//                if (userInput == 1) {
//                    rank = 0;
//                    isRegame = true;
//                    break;
//                } else if (userInput == 0) {
//                    break;
//                } else {
//                    System.out.println("1과 0중의 숫자 중 하나만 입력해주세요");
//                    continue;
//                }
//            }
//            return isRegame;
//        }
//
//
//    }
//}
