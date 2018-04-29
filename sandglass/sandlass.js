function sandlass( N, symbol ) {
    // 2n^2 - 1 <= N
    let n = Math.floor( Math.sqrt( ( N + 1 ) / 2 ) )
    let lineCount = 2 * n - 1
    let arr = new Array( 2 * n - 1 )
    for (var i = 0; i < lineCount; i++) {
        index = i >= n ? arr.length - i - 1 : i
        console.log( arr.fill( ' ' ).fill( symbol, index, arr.length - index ).join('') )
    }
    console.log( N - ( 2 * Math.pow( n, 2 ) - 1 ) )
}

sandlass( 19, '*' )
