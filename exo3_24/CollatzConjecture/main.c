#include <stdio.h>
#include <windows.h>

int main(int argc, char * argv[])
{
    printf("***Running %s***\n\n", argv[0]);

    if(argc == 2)
    {
        int input;
        sscanf(argv[1], "%d", &input);
        printf("%d ", input);
        while (input != 1)
        {
            if(input%2 == 0) input = input/2;
            else input = input*3 + 1;
            printf("%d ",input);
        }
    }
}
