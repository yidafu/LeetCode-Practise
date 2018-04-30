function typesetting( str, N ) {
    let rowCount = N;
    let len = str.length
    let lineCount = Math.ceil( len / rowCount )
    let arr = str.split('')
    let out = []
    while( arr.length ) {
        out.push( arr.splice( 0, rowCount ) )
    }
    out = out.reverse()
    let reStr = ''
    for (var i = 0; i <out[ out.length - 1 ].length; i++) {
        for (var j = 0; j < out.length; j++) {
            if( out[j][i] == undefined )
                reStr += " "
            else
                reStr += out[j][i]
        }
        reStr += "\n"
    }
    console.log( reStr )
}

typesetting( "This is a test case", 4)
