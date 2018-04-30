<?php
$str = "This is a test case";

$strlen = strlen( $str );
$rowCount = 4;
$lineCount = intval($strlen / 4) + 1;

$arr = str_split( $str );

$res = array_reverse( array_chunk( $arr, $rowCount ) );

for( $i=0; $i < $rowCount ; $i++ ) {
    for( $j=0; $j < $lineCount; $j++ ) {
        if( empty( $res[$j][$i] ) )
            echo " ";
        else
            echo $res[$j][$i];
    }
    echo "\n";
}
