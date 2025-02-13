// @ts-check
const { defineConfig, devices } = require('@playwright/test');

module.exports = defineConfig({
  testDir: './tests',

  expect: {
    timeout: 30 * 1000
  },

  timeout: 50000,
  reporter: 'html',

  use: {

    trace: 'on-first-retry',
  },


  projects: [
    {
      name: 'chromium',
      use: { 
        headless:false,
        screenshot:'only-on-failure',
        trace:'retain-on-failure'
        },
    }

  ],

});

