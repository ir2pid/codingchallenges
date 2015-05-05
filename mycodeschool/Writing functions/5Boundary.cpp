/* Your includes go here */

int* boundary(int* numbers, int numbersLength)
{
    /* Complete this function */
    int *arr= new int[2];
    arr[0] = numbers[0];
    arr[1] = numbers[numbersLength-1];
    return arr;
}