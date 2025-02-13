// @ts-check
const { defineConfig, devices } = require('@playwright/test');


module.exports = defineConfig({
  testDir: './tests',
  retries:1,
  //fullyParallel: true,
  timeout:30000,

  expect:{
    timeout:30000
  },
  
  reporter: 'html',
  
  projects: [
    {
      name: 'chrome',
      use: {
        headless:false,
        browserName:'chromium',
        trace: 'retain-on-failure', //generates logs
        screenshot: 'only-on-failure',
        // viewport:{width:1080,height:1080},
        ...devices['iPad (gen 5) landscape'],
        ignoreHTTPSErrors:true, //to disable SSL certification
        // video:'retain-on-failure'
      },
    },

    {
      name: 'firefox',
      use: { },
    },

    {
      name: 'webkit',
      use: {  },
    },
  ]

});

