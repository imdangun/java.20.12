package ch07.ex02.case06.home;

import ch07.ex02.case06.home.dao.ScoreDao;
import ch07.ex02.case06.home.dao.ScoreDaoImpl;
import ch07.ex02.case06.home.domain.Score;
import ch07.ex02.case06.home.presentation.Console;
import ch07.ex02.case06.home.presentation.ScoreIo;
import ch07.ex02.case06.home.service.ScoreService;
import ch07.ex02.case06.home.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		int studentCnt = Console.inNum("학생 수를 입력하세요");
		Score[] scores = new Score[studentCnt];
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play(studentCnt);
		
		Console.info("끝.");
	}
}
/*
점수 관리 앱을 만든다.
앱3개층 구조를 구현한다.
--

학생 수를 입력하세요: 2
점수 입력을 시작합니다.

1번째 학생입니다.
국어: 90
영어: 90
수학: 90

2번째 학생입니다.
국어: 80
영어: 80
수학: 80

점수 입력이 끝났습니다.

번호 국어 영어 수학 합계 평균
 1    90   90   90  270   90
 2    80   80   80  240   80
 
 끝.
*/