Collection = require './collection'

class Webhooks extends Collection

    model: require '../models/Webhook'

    url: "#{ env.SINGULARITY_BASE }/#{ constants.apiBase }/webhooks"

    parse: (webhooks) =>
        _.each webhooks, (webhook, i) =>
            webhooks[i] = url: webhook

        webhooks

    comparator: 'url'

module.exports = Webhooks