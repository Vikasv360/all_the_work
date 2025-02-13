// @ts-check
const { defineConfig, devices } = require('@playwright/test');

module.exports = defineConfig({
  testDir: './tests',
  retries: 2,
  reporter: 'html',
  timeout: 30 * 1000, //this timeout for overall test
  
  expect: {
    timeout: 5000
  }, //for assertion

  projects:[{
    name:'chrome',
    use: {
      browserName: 'chromium',
      headless:false,
      // trace: 'on-all-retries',
      screenshot:'on',
      viewport:{width:1080,height:1080},
      ignoreHTTPSErrors:true,
      // video:'retain-on-failure'
    }
  },
  // {
  //   name:'firefox',
  //   use: {
  //     browserName: 'firefox',
  //     headless:false
  //   }
  // }
    
  ]


});

