function Callatz( callatz, found ) {
    if( callatz == 1 ) return
    ++ found[ callatz ]
    if( callatz % 2 == 0 )
        Callatz( callatz / 2, found )
    else
        Callatz( ( callatz * 3 + 1 )  / 2, found )
}

function findKeyNumber( arr ) {
    found = ( new Array( 298 ) ).fill( 0 )

    for( let callatz of arr ) {
        Callatz( callatz, found )
    }

    let res = []
    for( let index = 0; index < found.length; ++ index ) {
        if( found[ index ] === 1 )
            res.push( index )
    }
    console.log( res.sort( ( x, y ) => y - x ) )
}

let arr = [ 3, 5, 6, 7, 8, 11 ]

findKeyNumber( arr )
