//
//  FitExtractor.h
//  FitMac
//
//  Created by John Malone on 29/12/2014.
//  Copyright (c) 2014 John Malone. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface FitExtractor : NSObject
- (int)extractData:(const char*)pathToFile;
@end
