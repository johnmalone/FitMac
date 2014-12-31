//
//  AppDelegate.m
//  FitMac
//
//  Created by John Malone on 29/12/2014.
//  Copyright (c) 2014 John Malone. All rights reserved.
//

#import "AppDelegate.h"
#include "MasterViewController.h"
#include "FitExtractor.h"

@interface  AppDelegate()
@property (nonatomic,strong) IBOutlet MasterViewController *masterViewController;
@end

@implementation AppDelegate

- (void)applicationDidFinishLaunching:(NSNotification *)aNotification
{
    // Insert code here to initialize your application
    // 1. Create the master View Controller
    self.masterViewController = [[MasterViewController alloc] initWithNibName:@"MasterViewController" bundle:nil];
    
    NSBundle *mainBundle = [NSBundle mainBundle];
    NSString *myFile = [mainBundle pathForResource: @"example" ofType: @"fit"];
    const char *pathToFit = [myFile UTF8String];
    
    int ans = [[FitExtractor alloc] extractData:pathToFit];
    
    // 2. Add the view controller to the Window's content view
    [self.window.contentView addSubview:self.masterViewController.view];
    self.masterViewController.view.frame = ((NSView*)self.window.contentView).bounds;
}

@end
