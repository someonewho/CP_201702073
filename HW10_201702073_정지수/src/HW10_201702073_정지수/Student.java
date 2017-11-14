package HW10_201702073_Á¤Áö¼ö;

public class Student {
    private int _scoreKorean;
    private int _scoreEnglish;
    private int _scoreComputer;

    public Student() {
        this._scoreKorean = 0;
        this._scoreEnglish = 0;
        this._scoreComputer = 0;
    }

    public void setScoreKorean(int aScoreKorean) {
        this._scoreKorean = aScoreKorean;
    }

    public void setScoreEnglish(int aScoreEnglish) {
        this._scoreEnglish = aScoreEnglish;
    }

    public void setScoreComputer(int aScoreComputer) {
        this._scoreComputer  = aScoreComputer;
    }

    public int scoreKorean() {
        return this._scoreKorean;
    }

    public int scoreEnglish() {
        return this._scoreEnglish;
    }

    public int scoreComputer() {
        return this._scoreComputer;
    }

    private char score2Grade(int aScore) {
        if(aScore >= 90) {
            return 'A';
        } else if(aScore >= 80) {
            return 'B';
        } else if(aScore >= 70) {
            return 'C';
        } else if(aScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public char gradeKorean() {
        return this.score2Grade(this._scoreKorean);
    }

    public char gradeEnglish() {
        return this.score2Grade(this._scoreEnglish);
    }

    public char gradeComputer() {
        return this.score2Grade(this._scoreComputer);
    }

    public double gradePointKorean() {
        return this.grade2Point(this.score2Grade(this._scoreKorean));
    }

    public double gradePointEnglish() {
        return this.grade2Point(this.score2Grade(this._scoreEnglish));
    }

    public double gradePointComputer() {
        return this.grade2Point(this.score2Grade(this._scoreComputer));
    }


    public double gpa() {
        double gradePointKorean, gradePointEnglish, gradePointComputer;
        gradePointKorean = gradePointKorean();
        gradePointEnglish = gradePointEnglish();
        gradePointComputer = gradePointComputer();
        return (gradePointKorean + gradePointEnglish + gradePointComputer) / 3.0;
    }



    private double grade2Point(char aGrade) {
        switch(aGrade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            default: return 0.0;
        }
    }
}