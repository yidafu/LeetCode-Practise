# @param {Integer} x
# @return {Integer}
def reverse(x)
    res = x.to_s.reverse.to_i

    return 0 if ( ( (-2)**31) > res || res > ((2**31)-1))
    return -res if x < 0
    res
end
