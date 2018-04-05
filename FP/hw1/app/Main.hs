module Main where

import Lib

main :: IO ()
main = print (contains 3 [[1..5], [2,0], [3,4]])
