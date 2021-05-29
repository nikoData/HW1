
enum Shape {
    DIAMONDS,
    SPADES,
    CLUBS,
     HEARTS,
}


public class Card {
    private int number;
    private Shape type;

    public Card(int number, Shape type){
        this.number = number;
        this.type = type;
    }

    public int compare(Card  other){
        int result = this.number - other.number ;
        if(result == 0)
            return result;
        else if (result > 0)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString(){
        char shapeOutput = '0';
        String valOutput;

        switch (this.number){
            case 10:
                valOutput = "Ace";
                break;
            case 11:
                valOutput = "Jack";
                break;

            case 12:
                valOutput = "Queen";
                break;
            case 13:
                valOutput = "King";
                break;
            default:
                valOutput = String.valueOf(this.number);
        }

        switch (this.type){
            case CLUBS:
                shapeOutput = '♠';
                break;
            case DIAMONDS:
                shapeOutput = '♦';
                break;
            case SPADES:
                shapeOutput = '♣';
                break;
            case HEARTS:
                shapeOutput = '♥';
                break;
        }

        return valOutput +" of " + shapeOutput;

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setType(Shape type) {
        this.type = type;
    }

    public Shape getType() {
        return type;
    }
}
