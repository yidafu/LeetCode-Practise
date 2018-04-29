function SingleDigitStatistics( N ) {
    let res = new Array(10).fill(0)
    N.toString().split('').map( x => {
        ++ res[ parseInt( x ) ];
    } )
    res.forEach( ( val, index ) => {
        if( val != 0 )
            console.log( index + ":" + val )
    } )
}

SingleDigitStatistics( 100311 )
