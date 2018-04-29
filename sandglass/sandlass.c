#include <stdio.h>
#include <math.h>

int main() {
    int N, n, lineCount, index;
    char symbol;
    scanf( "%d %c", &N, &symbol );
    n = sqrt( ( N + 1 ) / 2 );
    lineCount = 2 * n - 1;

    for( index = 0; index < lineCount; index++ ) {
        int offset = index >= n ? lineCount - index - 1 : index;
        for ( int jdenx = 0; jdenx < lineCount - offset; jdenx++ ) {
            if( jdenx < offset )
                printf( " " );
            else
                printf( "%c", symbol );
        }
        printf("\n");
    }
    /*
    @NOTE c lang is strong type
     */
    printf("%d\n",(int)( N - ( 2 * pow( (double)n, 2.0 ) - 1 ) ) );
    return 0;
}
