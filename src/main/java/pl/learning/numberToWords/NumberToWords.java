package pl.learning.numberToWords;

public class NumberToWords {
    public static void main (String[] args){
        numberToWords(1950);
    }

    public static void numberToWords (int number){
        int n=number;
        int count=getDigitCount(number);
        number = reverse(number);
        int reverseCount=getDigitCount(number);

        if(number<0){
            System.out.println("Invalid Value");
        } else if (number<10){
            switch(number){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
        } else if (number>=10){
            int lastDigit;
            while(number!=0){
                lastDigit=number%10;
                switch(lastDigit){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        break;
                }
                number/=10;
                if(number<10){
                    lastDigit=number;
                    switch(lastDigit){
                        case 0:
                            System.out.print("Zero ");
                            break;
                        case 1:
                            System.out.print("One ");
                            break;
                        case 2:
                            System.out.print("Two ");
                            break;
                        case 3:
                            System.out.print("Three ");
                            break;
                        case 4:
                            System.out.print("Four ");
                            break;
                        case 5:
                            System.out.print("Five ");
                            break;
                        case 6:
                            System.out.print("Six ");
                            break;
                        case 7:
                            System.out.print("Seven ");
                            break;
                        case 8:
                            System.out.print("Eight ");
                            break;
                        case 9:
                            System.out.print("Nine ");
                            break;
                        default:
                            break;
                    }
                    number=0;
                }
            }
        }

        if (reverseCount<count){
            count-=reverseCount;
            while(count>0){
                System.out.print("Zero ");
                count--;
            }
        }
    }
    public static int reverse (int number){
        int lastDigit=0;
        int reversedNumber=0;

        if (number<10 && number>=0){
            reversedNumber=number;
        } else if(number>-10 && number<0){
            reversedNumber=number;
        } else if(number>0){
            while(number>0){
                lastDigit=number%10;
                reversedNumber+=lastDigit;
                reversedNumber*=10;
                number/=10;
                if(number<10){
                    reversedNumber+=number;
                    number=0;
                }
            }
        } else if(number<0){
            while(number<0){
                lastDigit=number%10;
                reversedNumber+=lastDigit;
                reversedNumber*=10;
                number/=10;
                if(number>-10){
                    reversedNumber+=number;
                    number=0;
                }
            }
        }
        return reversedNumber;
    }
    public static int getDigitCount (int number){
        if (number<0){
            return -1;
        } else {
            int count=1;
            while(number>9){
                number/=10;
                count++;
            } return count;
        }
    }
}
