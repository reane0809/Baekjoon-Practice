N, M = map( int, input().split() )
nums = list( map( str, range( 1, N + 1 ) ) )

from itertools import combinations_with_replacement
print( '\n'.join( map( ' '.join, combinations_with_replacement( nums, M ) ) ) )
