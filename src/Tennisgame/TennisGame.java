package Tennisgame;

public class TennisGame {
    public class tennisGame {

        private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

        public static String getScore(String player1Name, String player2Name, int score1, int score2) {
            if (score1 == score2) {
                return getTiedScore(score1);
            }

            if (score1 >= 4 || score2 >= 4) {
                return getAdvantageOrWin(score1, score2);
            }

            return getRegularScore(score1, score2);
        }

        private static String getTiedScore(int score) {
            switch (score) {
                case 0: return "Love-All";
                case 1: return "Fifteen-All";
                case 2: return "Thirty-All";
                case 3: return "Forty-All";
                default: return "Deuce";
            }
        }

        private static String getAdvantageOrWin(int score1, int score2) {
            int scoreDifference = score1 - score2;

            if (scoreDifference == 1) {
                return "Advantage player1";
            } else if (scoreDifference == -1) {
                return "Advantage player2";
            } else if (scoreDifference >= 2) {
                return "Win for player1";
            } else {
                return "Win for player2";
            }
        }

        private static String getRegularScore(int score1, int score2) {
            StringBuilder score = new StringBuilder();

            score.append(SCORE_NAMES[score1]);
            score.append("-");
            score.append(SCORE_NAMES[score2]);

            return score.toString();
        }
    }
}
