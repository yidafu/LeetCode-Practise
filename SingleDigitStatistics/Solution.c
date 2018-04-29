#include <stdio.h>
#include <string.h>
int main() {
    char N[1000];
    scanf( "%s", N );
    int res[10] = { 0 },
        len = strlen( N );
    for( int index = 0; index < len; ++ index ) {
        int num = N[ index ] - 48;
        ++ res[ num ];
    }
    for( int index = 0; index < 10; ++ index ) {
        if( res[index] != 0 )
            printf( "%d:%d", index, res[index] );
    }
}
