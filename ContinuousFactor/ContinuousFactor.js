function helper( start, end) {
    if( start >= end )
        return end
    return  start * helper( start + 1 , end)
}

function ContinuousFactor( N ) {
    let start = 0
    let maxLen = 0
    upperLimit = Math.ceil( Math.sqrt( N ) )
    for( let i = 2; i <= upperLimit; ++i ) {
        for( let j = i; j <=  upperLimit; ++ j ) {
            sum = helper(i , j)
            if( sum > N ) continue
            if( N % sum == 0 ) {
                // console.log( j, i )
                if( maxLen < j - i + 1 ) {
                    // console.log( j, i )
                    maxLen = j - i + 1
                    start = i
                }
            }
        }
    }
    console.log( maxLen )
    console.log( (new Array( maxLen )).fill(0).map( val => ++ start ).join( '*' ) )
}

ContinuousFactor( 6 )
ContinuousFactor( 630 )
