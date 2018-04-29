let count = 0
function CountCallatz( callatz ) {
    if( callatz == 1 ) return
    ++ count
    if( callatz % 2 == 0 ) CountCallatz( callatz / 2 )
    else CountCallatz( ( callatz * 3 + 1 )  / 2 )
}

CountCallatz( 3 )
console.log( count )
