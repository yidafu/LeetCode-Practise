function typesetting( str, N ) {
    let rowCount = N;
    let len = str.length
    let lineCount = Math.ceil( len / rowCount )
    let arr = str.split('')
    let out = []
    while( arr.length ) {
        out.push( arr.slice( 0, lineCount ) )
    }
    console.log( out )
}
