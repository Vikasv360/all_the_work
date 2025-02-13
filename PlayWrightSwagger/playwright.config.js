// @ts-check
const { defineConfig, devices } = require('@playwright/test');


module.exports = defineConfig({
  testDir: './tests',

  retries:2,
  timeout: 30 * 1000,

  expect: {
    timeout: 5000
  },

  reporter: 'html',


  projects: [
    {
      name: 'chrome',
      use: {
        browserName: 'firefox',
        headless: true,
        screenshot: 'on',
        trace:'retain-on-failure'
      },
    },

    // {
    //   name: 'firefox',
    //   use: { ...devices['Desktop Firefox'] },
    // },

    // {
    //   name: 'webkit',
    //   use: { ...devices['Desktop Safari'] },
    // },
  ]
});

