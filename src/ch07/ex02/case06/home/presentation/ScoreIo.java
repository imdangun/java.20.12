package ch07.ex02.case06.home.presentation;

import ch07.ex02.case06.home.domain.Score;
import ch07.ex02.case06.home.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play(int studentCnt) {
		Console.info("점수 입력을 시작합니다.");
		
		Score score = null;
		for(int i = 0; i < studentCnt; i++) {
			Console.info((i + 1) + "번째 학생입니다.");
			
			score = new Score();
			score.setKorScore(Console.inNum("국어"));
			score.setEngScore(Console.inNum("영어"));
			score.setMathScore(Console.inNum("수학"));
			
			scoreService.addScore(score);			
		}
		
		Console.info("점수 입력이 끝났습니다.");
		this.printScores();
	}
	
	private void printScores() {
		Score[] scores = scoreService.getScores();
		
		Console.info("번호 국어 영어 수학 합계 평균");
		System.out.println("-----------------------------");
		
		int num = 0;
		for(Score score: scores) {
			Console.outNum(++num);
			Console.info(score);
		}
	}
}
