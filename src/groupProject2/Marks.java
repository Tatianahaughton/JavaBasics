package groupProject2;

public abstract class Marks {
    double score1;
    double score2;
    double score3;
    double score4;
    void getPercentage() {
        double average;
        average = (score1 + score2 + score3) / 3;
        System.out.println(average);
    }
}

    class StudentA extends Marks {
        StudentA(double score1, double score2, double score3) {
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }

    }

    class StudentB extends Marks {
        StudentB(double score1, double score2, double score3, double score4) {
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
            this.score4 = score4;
        }

        void getPercentage() {
            double average;
            average = (score1 + score2 + score3 + score4) / 4;
            System.out.println(average);
        }
    }



