/* Your includes go here */

void evenOut(int* numbers, int numbersLength)
{
    /* Complete this function */
    int i=0;
    while(i<numbersLength){
        if(numbers[i]%2 != 0){
            numbers[i]--;
        }
        i++;
    }
}